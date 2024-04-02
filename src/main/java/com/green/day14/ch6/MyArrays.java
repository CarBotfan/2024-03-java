package com.green.day14.ch6;

import java.util.Arrays;

public class MyArrays {
    static void printArr(int[] arr) {
        System.out.printf("[");
        if(arr.length != 0) {
            System.out.print(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.printf(", %d", arr[i]);
            }
        }
        System.out.printf("]\n");
    }
    static String toString(int[] arr) {
        if(arr.length == 0) {
            return "[]";
        }
        String str1 = "[" +  + arr[0];
        //String str1 = String.format("[%d", arr[0]);
        for(int i = 1; i < arr.length; i++) {
            str1 =  str1 + ", " +arr[i];
//            str1 += String.format(", %d", arr[i]);
        }
        str1 += "]";
        return str1;
    }
}
class myArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 10};
        MyArrays.printArr(arr);
        int[] arr2 = {};
        System.out.println(MyArrays.toString(arr));
        System.out.println(MyArrays.toString(arr2));
    }
}
