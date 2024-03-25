package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        /*
        Scanner 객체를 사용하여 월 값을 정수로 입력받음
        month 값이 3 ~ 5라면 "현재의 계절은 봄입니다." 출력
        6~8이면 여름
        9~11이면 가을
        12~2는 겨울
        이외의 값은 "잘못 입력하셨습니다"
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("월 값 입력 >> ");
        int month = scan.nextInt();

        String season;
        if(month > 12 || month < 1) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            season = switch(month) {
                case 3, 4, 5 -> "봄";
                case 6, 7, 8 -> "여름";
                case 9, 10, 11 -> "가을";
                default -> "겨울";
            };
            System.out.printf("현재의 계절은 %s입니다.\n", season);
        }

    }
}
