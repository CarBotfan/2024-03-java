package com.green.day4;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while (true) {
            System.out.println("숫자를 입력해 주세요. (종료:0) >> ");
            input = scan.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("sum: " + sum);
    }
}