package com.green.day17.ch11;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        Object obj = 10;
        obj = "하하하하";
        obj = 11.1;//여러 자료형의 값을 넣을 수 있음

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("haha");
        list.add(11.1);

        int r= (int)list.get(0);
        System.out.println(r);
    }
}
