package com.green.day17.ch11;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer n2 = 20;//객체로 취급, 메소드 사용 가능
        double d1 = 10.1;
        Double d2 = 10.2;
        List<Integer> list = new ArrayList();//제네릭
        list.add(n1);
        list.add(n2);
        list.add(30);
        list.remove(0);//자유롭게 추가,삭제 및 길이 변경 가능
        //list.add("!"); 정수 외 다른 타입 추가 불가
        System.out.println(list);
        int r1 = list.get(0);//형변환 없이 값을 가져올 수 있음

        for(int i = 0; i < list.size(); i++) {
            System.out.printf("list.get(%d) >> %d\n", i, list.get(i));
        }
    }
}
