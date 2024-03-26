package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        System.out.println(Arrays.toString(numArr));
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 1;
        }
        for(int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
