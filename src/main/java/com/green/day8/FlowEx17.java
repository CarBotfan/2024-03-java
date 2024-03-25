package com.green.day8;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*를 출력할 라인 수 입력 >> ");
        int line = scan.nextInt();
        for(int i = 0; i < line; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
