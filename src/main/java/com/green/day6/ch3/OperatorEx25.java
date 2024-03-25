package com.green.day6.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String str = "abcdefg";
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(6));
        char ch = ' ';
        System.out.println("문자를 하나 입력하세요 >> ");
        String input = scan.nextLine();
        ch = input.charAt(0);
        if('0' <= ch && ch <='9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        } else if('a' <= ch && ch <= 'z') {
            System.out.println("입력하신 문자는 소문자입니다.");
        } else if('A' <= ch && ch <= 'Z') {
            System.out.println("입력하신 문자는 대문자입니다.");
        }
    }
}
