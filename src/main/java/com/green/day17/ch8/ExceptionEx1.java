package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 20;
            int c = 10 / 0;
            throw new Exception();//새로운 오류 생성
        } catch(ArithmeticException e) {
            System.out.println("수학적 예외 발생");
        } catch(Exception e) {//최상위 예외(다른 예외들을 모두 포함함)
            e.printStackTrace();
            System.out.println("예외 발생");//예외 발생시 실행
        } finally {
            System.out.println("finally");//무슨 일이 있어도 반드시 실행
        }
        System.out.println("종료");
    }
}
