package com.green.day9;

public class FlowEx29 {
    public static void main(String[] args) {
        /*369게임
        1~100까지
         */
        for(int i = 1; i < 1000; i++) {
            int n = i;//현재 숫자 받아옴
            System.out.print(n+" ");
            while(n != 0) {
                if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {//1의자리 체크
                    System.out.print("짝");
                }
                n /= 10;//1의 자리 버림
            }
            System.out.println();
        }
    }
}
