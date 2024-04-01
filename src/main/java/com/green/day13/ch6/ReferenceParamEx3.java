package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4};
        int[] arr2 = {};
        System.out.println(Arrays.toString(arr));

        printIntArr(arr); // [3,2,1,6,5,4]
        printIntArr(arr2);
    }
    public static void printIntArr(int[] numArr) {
        if(numArr.length == 0) {
            System.out.println("[]");
        } else {
            System.out.printf("[%d", numArr[0]);
            for (int i = 1; i < numArr.length; i++) {
                System.out.printf(", %d", numArr[i]);
            }
            System.out.println("]");
        }
        System.out.println(Arrays.toString(numArr));
    }
}
