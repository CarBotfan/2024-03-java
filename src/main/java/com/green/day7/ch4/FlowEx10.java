package com.green.day7.ch4;
import java.util.Scanner;
public class FlowEx10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char grade;
        int score;
        System.out.print("점수 입력 >> ");
        score = scan.nextInt();
        scan.close();
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else {
            grade = switch (score / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                default -> 'F';
            };
            String result = String.format("당신의 학점은 %c입니다.\n", grade);
            System.out.println(result);
        }
    }
}
