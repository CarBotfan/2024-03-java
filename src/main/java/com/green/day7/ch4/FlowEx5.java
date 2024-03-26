package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char grade = 'A',symbol = '+';
        int score;
        System.out.print("점수 입력 >> ");
        score = scan.nextInt();
        scan.close();
        if(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다.");
        } else {
            if(score > 89 && score < 100) {
                grade = 'A';
                symbol = switch(score % 10) {
                    case 0,1,2 -> '-';
                    case 7,8,9 -> '+';
                    default -> '0';
                };
            } else if(score > 79 && score < 100) {
                grade = 'B';
                symbol = switch(score % 10) {
                    case 0,1,2 -> '-';
                    case 7,8,9 -> '+';
                    default -> '0';
                };
            } else if(score < 80) {
                grade = 'C';
                symbol = ' ';
            }
            String result = String.format("당신의 학점은 %c%c입니다.\n", grade, symbol);
            System.out.println(result);
        }
    }
}
