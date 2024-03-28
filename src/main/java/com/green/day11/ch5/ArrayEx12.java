package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println(tmp);
        names[0] = "Yu";
        System.out.println(names[0]);

        //향상된 for문
        //for each 문
        for(String name : names) {
            System.out.println(name);
        }
    }
}
