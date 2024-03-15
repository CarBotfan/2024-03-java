package com.green.day2;

public class Test {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            int num1 = (int) (Math.random() * 9 + 1) * (int) (Math.random() * 9 + 1);
            String s = "a";
            s = num1 % 2 == 0 ? "Even" : "Odd";
            System.out.printf("%d\n", num1);
            System.out.println(s);
        }
    }
}
