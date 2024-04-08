package com.green.day17.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        try {
            divThrows(10,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //divThrows(10, 2);
    }
    public static void div(int n1, int n2){
        System.out.println(n1 / n2);
    }
    public static void divThrows(int n1, int n2) throws Exception {
        try {
            System.out.println(n1 / n2);
        } catch(Exception e) {
            System.out.println("0으로 나누기 불가");
        }
    }
}
