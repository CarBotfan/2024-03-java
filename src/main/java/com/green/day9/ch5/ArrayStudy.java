package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        /*System.out.println(numArr[10]);*/ //예외발생
        String[] strArr = new String[5];
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);

        int[] numArr2 = {10, 20, 30, 40, 50};
        int[] numArr3 = new int[] {10, 20, 30};
        System.out.println(numArr2[1]);
        numArr2[1] = 25;
        System.out.println(numArr2[1]);
        /*
        배열을 사용하는 이유: 같은 타입의 여러 값ㅇ르 편하게 쓰기/읽기 하기 위해서
        index 값은 0 ~ 배열 크기 - 1
         */
    }
}
