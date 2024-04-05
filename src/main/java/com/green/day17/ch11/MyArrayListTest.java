package com.green.day17.ch11;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.showLength();
        list.add(10);
        list.showLength();
        list.add(20);
        list.showLength();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        list.showLength();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.get(0));
    }
}

class MyArrayList {
    private int[] arr;
    MyArrayList() {
        this.arr = new int[0];
    }
    void add(int n) {
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = n;
        arr = temp;
    }
    void showLength() {
        System.out.println("len : " + arr.length);
    }
    @Override
    public String toString() {
        if(arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));
        for(int i = 1; i < arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));
        }
        sb.append("]");
        return sb.toString();
    }
    int size() {
        return arr.length;
    }
    int get(int n) {
        return arr[n];
    }
}