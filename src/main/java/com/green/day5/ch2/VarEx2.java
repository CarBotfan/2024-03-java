package com.green.day5.ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x: " + x + " y: " + y);
        //x와 y의 값을 서로 교환
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x: " + x + " y: " + y);
    }
}
