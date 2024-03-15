package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args) {
        //삼항식, 조건식
        //식 ? true일때 : false일 때;
        String s = "짝";
        s = "홀";
        int num = (int)(Math.random() * 10) + 1; //1~10
        System.out.println(num + "은(는) " + (num % 2 == 0 ? "짝수입니다" : "홀수입니다"));
    }
}
