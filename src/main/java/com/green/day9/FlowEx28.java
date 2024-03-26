package com.green.day9;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        /*
        1~100 사이의 랜덤값 생성
        1 ~ 100 사이의 랜덤값을 맞추는 게임
        입력한 숫자보다 정답이 크면 up 작으면 down
        맞출때까지 반복
         */
        Scanner scan = new Scanner(System.in);
        int randomInt = (int)(Math.random() * 100.0) + 1;
        int num;
        while(true) {
            System.out.print("1 ~ 100 사이의 정수를 입력하세요 >> ");
            num = scan.nextInt();
            if(num == randomInt) {
                break;
            }
            System.out.println((num > randomInt ? "down" : "up"));
        }
        System.out.println("정답");
    }
}
