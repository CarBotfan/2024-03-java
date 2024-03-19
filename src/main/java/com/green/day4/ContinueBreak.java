package com.green.day4;

public class ContinueBreak {
    public static void main(String[] args) {
        //continue, break 둘 다 반복문 안에서 사용 가능

        //continue > skip에 가깝다
        //break > stop에 가깝다
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                break;//반복문 탈출
            }
            System.out.println(i);
        }
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;//반복문 1회 스킵
            }
            System.out.println(i);
        }
    }
}
