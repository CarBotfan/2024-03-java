package com.green;

import java.util.Arrays;
import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("문제를 입력하세요. >> ");
        String input_answer = scan.nextLine();//사용자가 입력한 값을 정답으로

        System.out.println(input_answer);//정답확인용
        //만약 스페이스가 있다면 스페이스로 표시하게 가능?? 예외처리

        //char[] answer_copy=answer; //미스! 주소값 복사를 해버려 카피를 바꾸면 다같이 바뀌어버림
        char[] answer_copy = input_answer.toCharArray();
        for(int i = 0; i < answer_copy.length; i++) {
            answer_copy[i] = '_';
        }


        char input_user;
        int x = 0;

        while(x < answer_copy.length) {
            System.out.print("알파벳을 입력하세요. >> ");
            input_user = scan.next().charAt(0);
            if (input_user >= 97 && input_user <= 122) {//a=97 z=122 유니코드로 소문자 알파벳으로 제한
                if(input_user == input_answer.toCharArray()[x]) {
                    answer_copy[x++] = input_user;
                    System.out.println(Arrays.toString(answer_copy));
                }
                else {
                    System.out.println("wrong alphabet");
                }
            } else {
                System.out.println("입력이 올바르지 않습니다.");
                System.out.println("영어 소문자를 입력하세요.");
            }

        }

    }
}