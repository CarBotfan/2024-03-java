package com.green.day13.ch6;
//p.289 가변인자, 잘 사용하지 x
public class VarArgsEx {
    public static void main(String[] args) {
        MyMath3_1 mm = new MyMath3_1();
        mm.sum(1, 2, 3, 4, 5, 6, 7, 8);
    }
}

class MyMath3_1 {
    void sum(int...arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}