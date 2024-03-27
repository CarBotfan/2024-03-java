package com.green.day9.ch5;

public class MissionArray2 {
    public static void main(String[] args) {
        /*
        정수값 10개 저장하는 배열 생성
        10칸 초기화, 10 ~ 30 랜덤값 세팅
         */
        int[] numArr1 = new int[10];
        for(int i = 0; i < numArr1.length; i++) {
            numArr1[i] = (int)(Math.random() * 21.0) + 10;
        }
        for(int i = 0; i < numArr1.length; i++) {
            System.out.println(numArr1[i]);
        }
    }
}
