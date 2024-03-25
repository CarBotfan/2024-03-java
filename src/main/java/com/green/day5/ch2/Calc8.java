package com.green.day5.ch2;

public class Calc8 {
    public static void main(String[] args) {
        int x = 0;
        for(int i = 1; i <= 10000; i++) {
            int num = i;
            if(num / 1000 == 8) {
                x++;
            }//천의 자리 체크
            num %= 1000;
            if(num / 100 == 8) {
                x++;
            }//백의 자리 체크
            num %= 100;
            if(num / 10 == 8) {
                x++;
            }//십의 자리 체크
            num %= 10;
            if(num == 8) {
                x++;
            }//일의 자리 체크
        }
        System.out.println(x);
    }
}
