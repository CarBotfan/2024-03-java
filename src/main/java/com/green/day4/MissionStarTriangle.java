package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5.0) + 3;
        System.out.println(star);
        for(int i = 0; i < star; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("end");
    }
}
