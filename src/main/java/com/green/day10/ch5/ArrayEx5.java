package com.green.day10.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};
        int sum = 0;
        double average;
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총점: " + sum);
        average = sum / (double)score.length;
        System.out.printf("평균: %.2f\n", average);
    }
}
