package com.green.day10.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95, 200};
        int min, max;
        min = score[0];
        max = score[0];
        for(int i = 1; i < score.length; i++) {
            if(min > score[i]) {
                min = score[i];
            }
            if(max < score[i]) {
                max = score[i];
            }
        }
        System.out.printf("min: %d max: %d", min, max);
    }
}
