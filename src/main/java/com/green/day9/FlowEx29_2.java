package com.green.day9;

public class FlowEx29_2 {
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++) {
            String n = Integer.toString(i);
            System.out.print(n+" ");
            for(int j = 0; j < n.length(); j++) {
                char c = n.charAt(j);
                if(c == '3' || c == '6' || c == '9') {
                    System.out.print("짝");
                }
            }
            System.out.println();
        }
    }
}
