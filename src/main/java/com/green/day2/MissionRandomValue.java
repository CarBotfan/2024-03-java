package com.green.day2;

public class MissionRandomValue {
    public static void main(String[] args) {
        //1~9 사이의 랜덤한 값 나올 수 있게 세팅
        for (int i = 0; i < 100; i++) {
            //int result = (int) ((Math.random() * 9) + 1);
            //System.out.println(result);
            //5~12
            int result_2 = (int)((Math.random() * 8) + 5);
            System.out.println(result_2);
        }

    }
}
