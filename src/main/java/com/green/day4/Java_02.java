package com.green.day4;

import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args) {
//        10만원 짜리 수표가 들어가는 자판기를 만들려고 합니다.
//                자판기에 수표를 입력하면 거스름돈을 계산하여 정확하게 필요한 화폐들의 개수를 계산하여야 합니다.
//        이를 계산하는 프로그램을 작성하시오.
//        ex)
//        거스름돈을 입력하세요 99990
//        50000원권 1개
//        10000원권 4개
//        5000원권 1개
//        1000원권 4개
//        500원권 1개
//        100원권 4개
//        50원권 1개
//        10원권 4개
        Scanner scan = new Scanner(System.in);
        System.out.println("거스름돈을 입력하세요");
        int num = scan.nextInt();
        int i = 0;
        if(num > 100000 || num < 0) {
            System.out.println("숫자를 잘못 입력하셨습니다.");
        } else {
            while(num - 50000 >= 0) {
                num -= 50000;
                i++;
            }
            System.out.printf("50000원권 %d개\n", i);
            i = 0;
            while(num - 10000 >= 0) {
                num -= 10000;
                i++;
            }
            System.out.printf("10000원권 %d개\n", i);
            i = 0;
            while(num - 5000 >= 0) {
                num -= 5000;
                i++;
            }
            System.out.printf("5000원권 %d개\n", i);
            i = 0;
            while(num - 1000 >= 0) {
                num -= 1000;
                i++;
            }
            System.out.printf("1000원권 %d개\n", i);
            i = 0;
            while(num - 500 >= 0) {
                num -= 500;
                i++;
            }
            System.out.printf("500원권 %d개\n", i);
            i = 0;
            while(num - 100 >= 0) {
                num -= 100;
                i++;
            }
            System.out.printf("100원권 %d개\n", i);
            i = 0;
            while(num - 50 >= 0) {
                num -= 50;
                i++;
            }
            System.out.printf("50원권 %d개\n", i);
            i = 0;
            while(num - 10 >= 0) {
                num -= 10;
                i++;
            }
            System.out.printf("10원권 %d개\n", i);
            i = 0;
        }
    }
}
