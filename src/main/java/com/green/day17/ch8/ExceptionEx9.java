package com.green.day17.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("예외 발생");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
