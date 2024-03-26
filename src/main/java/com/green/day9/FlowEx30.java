package com.green.day9;

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        final int NUM = 100;
        while(sum < NUM) {
            sum += ++i;
        }
        System.out.printf("i: %d sum: %d", i , sum);
    }
}
