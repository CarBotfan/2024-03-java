package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args) {
        Exam2.printGugudan(2, 4);

        Exam2.printGugudan(2, 9);

        int sum = Exam2.getSumFromString("23223");
        System.out.println(sum);
        sum = Exam2.getSumFromString("111");
        System.out.println(sum);
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        arr = Exam2.inputRandomValue(arr);
        System.out.println(Arrays.toString(arr));
        arr = Exam2.randomValueArr(20);
        System.out.println(Arrays.toString(arr));
    }
}
class Exam2 {
    static void printGugudan(int n, int m) {
        for(int i = 1; i <= 9; i++) {
            for(int j = n; j <= m; j++) {
                System.out.printf("%d x %d = %d\t", j , i, j*i);
            }
            System.out.println();
        }
    }
    static int getSumFromString(String str) {
        int sum = 0;
        int num = Integer.parseInt(str);
        do {
            sum += num % 10;
            num /= 10;
        } while(num != 0);
        sum += num;
        return sum;
    }
    static int[] inputRandomValue(int[] arr) {
        int[] numbers = randomValueArr(9);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i];
        }
        return arr;
    }
    static void inputRandomValue2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int rVal = (int)(Math.random() * 9) + 1;
            arr[i] = rVal;

            for(int z = 0; z < i; z++) {
                if(arr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
    static int[] randomValueArr(int num2) {
        int[] arr = new int[num2];
        for(int i = 0; i < num2; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i < num2; i++) {
            int randomInt = (int)(Math.random() * num2);
            int temp = arr[i];
            arr[i] = arr[randomInt];
            arr[randomInt] = temp;
        }
        return arr;
    }
}