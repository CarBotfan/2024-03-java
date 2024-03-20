package com.green.day4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 거스름돈 입력 받기
        System.out.print("거스름돈을 입력하세요: ");
        int change = scanner.nextInt();

        // 화폐 단위 정의
        int[] currencyUnits = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        // 거스름돈 계산
        for (int i = 0; i < 8; i++) {
            int unit = currencyUnits[i];
            int count = change / unit;
            change %= unit;
            if (count > 0) {
                System.out.println(unit + "원권 " + count + "개");
            }
        }
    }
}
