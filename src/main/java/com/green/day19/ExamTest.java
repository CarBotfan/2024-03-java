package com.green.day19;

import java.util.Arrays;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        int[] intArr = Exam.change(strArr);
        System.out.println(intArr[2] + intArr[1]);
    }
}
class Exam {
    static int[] change(String[] strArr) {
        int[] intArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}
