package com.green.day9;

import java.util.Scanner;

public class FlowEx27 {
    /*
    가이드 출력 "합계를 구할 숫자를 입력하세요. (종료: 0) >> "
    입력한 모든 숫자를 더한 값을 마지막에 출력
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;
        do{
            System.out.print("합계를 구할 숫자를 입력하세요. (종료: 0) >> ");
            num = scan.nextInt();
            sum += num;
        } while(num != 0);
        System.out.println("합: " + sum);
    }
}
