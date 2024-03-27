package com.green.day10.ch5;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30};
        /*
        스와핑, 0번칸, 2번칸 스와핑
         */
        int temp;
        temp = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = temp;
        System.out.println(Arrays.toString(numArr));
    }
}
