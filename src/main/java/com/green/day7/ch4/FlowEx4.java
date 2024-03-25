package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        /*
        Scanner를 통해 점수를 입력받음
        점수는 정수로 받으며, grade를 관리할 문자타입 선언
        만약 점수가 90점 이상이며 grade에 A값 저장
        80점 이상이면 B
        70점 이상이면 C
        69점 이하라면 D
         */
        Scanner scan = new Scanner(System.in);
        char grade;
        int score;
        System.out.print("점수 입력 >> ");
        score = scan.nextInt();
        scan.close();
        if(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다.");
        } else {
            grade = switch(score / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                default -> 'D';
            };
            String result = String.format("당신의 학점은 %c입니다.\n",grade);
            System.out.println(result);
        }
    }
}
