package com.green.day4;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        if (true && true) { //and
            System.out.println("true && true && true");
        }
        //int val = 1 / 0;
        boolean r = true && false && true && 1 / 0 == 0; //&&라면 중간에 false가 있는 경우 자동으로 false 처리
        System.out.println(r);
        boolean r2 = false && true && true;
        System.out.println(r2);
        boolean r3 = false & true & true; // &의 경우 끝까지 체크함
        System.out.println(r3);

        if (true || true) {//or
        }
    }
}
