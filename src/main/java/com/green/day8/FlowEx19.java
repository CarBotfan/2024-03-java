package com.green.day8;

public class FlowEx19 {
    public static void main(String[] args) {
        final int LAST_NUM = 6;
        for(int i = 1; i < LAST_NUM; i++) {
            for(int j = 1; j < LAST_NUM; j++) {
                for(int k = 1; k < LAST_NUM; k++) {
                    int num = i * 100 + j * 10 + k;
                    System.out.println(num);
                }
            }
        }
    }
}
