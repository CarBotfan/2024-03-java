package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args) {
        //Tv 객체의 주소 값을 3개 저장할수 있는 배열
        Tv[] tvArr = new Tv[3];

        //Tv 객체의 주소값을 각 칸에 넣음
        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }
        int i = 10;
        for(Tv tv : tvArr) {
            tv.channel = ++i;
            System.out.println(tv.channel);
        }
        for(i = 0; i < tvArr.length; i++) {
            tvArr[i].channel = i + 11;
            System.out.println(tvArr[i].channel);
        }
    }
}
