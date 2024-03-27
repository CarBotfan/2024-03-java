package com.green.day10.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 10;
        }
        System.out.println(Arrays.toString(numArr));

        for(int i = 0; i < numArr.length; i++) {
            int random = (int)(Math.random() * 10.0);
            int tmp = numArr[random];
            numArr[random] = numArr[i];
            numArr[i] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
