package com.green.day10.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            counterArr[numArr[i]]++;
        }
        for(int i = 0; i < counterArr.length; i++) {
            System.out.printf("counterArr[%d] : %d\n", i, counterArr[i]);
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(counterArr));
    }
}
