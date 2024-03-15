package com.green.day2;


public class RandomValue {
    public static void main(String[] args) {
        //형변환, 타입이 안맞으면 맞게 타입변화를 줘야 함
        //자동형변환, 강제형변환
        double Random = Math.random();
        System.out.println(Random * 10);
        int result = (int)(Random * 10);


        System.out.println(result);
    }

}
