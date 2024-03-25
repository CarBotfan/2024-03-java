package com.green.day8;

import java.util.Scanner;

public class FlowEx11 {
    /*
    Scanner 객체를 통해 주민번호 입력받음
    1 , 3 >> 각각 2000년 이전 이후인지 구별
    2, 4 >> 2000년 이전 이후인지 구별
    이외 값> 유효하지 않은 주민번호입니다 출력
     */
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요 >> ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        String result =switch(num.charAt(7)) {
            case '1' -> "당신은 2000년 이전에" +
                    " 출생한 남자입니다.";
            case '2' -> "당신은 2000년 이전에 출생한 여자입니다.";
            case '3' -> "당신은 2000년 이후에 출생한 남자입니다.";
            case '4' -> "당신은 2000년 이후에 출생한 여자입니다.";
            default -> "유효하지 않은 주민번호입니다.";
        };
        System.out.println(result);
    }


}
