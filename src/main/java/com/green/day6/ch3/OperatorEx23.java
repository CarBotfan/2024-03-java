package com.green.day6.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);//동일성
        System.out.println(str1.equals(str2));//동등성

        //동등성 > 지위,권리, 권한
        //동일성 > 같은 인물, 같다
    }
}
