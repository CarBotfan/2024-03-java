package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2;
        System.out.println("dan: " + dan);
        for(int i = 1; i < 10; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
//        for(int i = 2; i <= dan; i++) {
//            for(int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//        }
    }
}
