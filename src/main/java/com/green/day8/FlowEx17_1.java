package com.green.day8;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*를 출력할 라인 수 입력 >> ");
        int line = scan.nextInt();
        for(int i = 1; i <= line; i++) {
            for(int j = 0; j < (line - i); j++) {
                System.out.print("_");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = line; i> 0; i--) {
            for(int z = 1; z <= line; z++) {
                System.out.print(z<i ? "_" : "*");
            }
            System.out.println();
        }
    }
}
