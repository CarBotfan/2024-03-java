package com.green.day12.ch6;
import java.util.Arrays;
import java.util.Scanner;
public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10); //짝수입니다 출력
        mm.checkOddEven(11); //홀수입니다 출력
        mm.checkOddEven(0);
        Scanner scan = new Scanner(System.in);
        int r = mm.abs(10);
        System.out.println(r);
        r = mm.abs(-8);
        System.out.println(r);
        int randomValue = mm.getRandomValue(10);
        System.out.println(randomValue);
        randomValue = mm.getRandomValue(100);
        System.out.println(randomValue);
        mm.printGugudan(5);
        mm.printGugudan(9);
        int randomValue2 = mm.getRandomValue(10, 30);//10~29
        System.out.println(randomValue2);
        randomValue2 = mm.getRandomValue(5, 31);
        System.out.println(randomValue2);
        mm.PrintArray(mm.returnGugudan(2, 8));
    }
}

class MyMethod {
    void printGugudan(int n) {
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }
    String[][] returnGugudan(int n1, int n2) {
        String[][] gugudan = new String[n2 - n1 + 1][9];
        for(int i = 0; i <= (n2 - n1); i++) {
            int num1 = n1 + i;
            for(int j = 0; j < 9; j++) {
                int num2 = j + 1;
                gugudan[i][j] = num1 + " x " + num2 + " = " + num1 * num2;
            }
        }
        return gugudan;
    }
    void PrintArray(String[][] arr1) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
    void checkOddEven(int n) {
        if(n == 0) {
            System.out.println("0입니다.");
        }
        else if(n % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }

    }
    int abs(int num) {
        return num < 0 ? -num : num;
    }
    int getRandomValue(int num) {
        return (int)(Math.random() * num);
    }
    int getRandomValue(int num1, int num2) {
        return (int)(Math.random() * (num2 - num1)) + num1;
    }
}