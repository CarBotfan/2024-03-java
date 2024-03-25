package com.green.day8;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        /*
        숫자를 입력하세요(예:12345) >>
        정수로 값을 받음
        1 + 2 + 3 + 4 + 5 결과값을 출력
        "각 자리수의 합: 15" 출력
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력(예: 12345) >> ");
        int n = scan.nextInt();
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("합:" + sum);


    }
}
