package ru.netology.sqr;

public class SQRService {
    public int sqrCounting(int num1, int num2) {
        int cnt = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= num1) {
                if (i * i <= num2) {
                    cnt = cnt+1;
                }
            }
        }
        return cnt;
    }
}
