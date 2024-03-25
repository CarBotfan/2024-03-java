package com.green.day7.ch4;
import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요 >> ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        String result =switch(num.charAt(7)) {
            case '1', '3' -> "남자";
            case '2', '4' ->  "여자";
            default ->"유효하지 않은 주민번호";
        };
        System.out.println(result);
    }
}
