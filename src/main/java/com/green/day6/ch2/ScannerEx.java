package com.green.day6.ch2;

import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("두 자리 정수를 입력해주세요. >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        if(input.length() == 2) {
            System.out.println("num: " + num);
            System.out.println("num + 1: " + (num + 1));
        }
    }
}
