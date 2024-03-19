package com.green.day4;

public class missionABS {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 20) - 10;
        if(val < 0) {
            val = val * -1;
        }
        System.out.println(val);
        if(val < 0) {
            System.out.println(-val);
        } else {
            System.out.println(val);
        }
        System.out.println(val < 0 ? -val : val);
    }
}
