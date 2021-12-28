package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
         value={
                 "99,100,1",
                 "100,120,1",
                 "100,121,2",
                 "200,300,3"
         }
    )
    void shouldCalculate(int num1, int num2, int expected) {
        SQRService service = new SQRService();
        long actual = service.sqrCounting(num1, num2);
        assertEquals(expected, actual);
    }

}