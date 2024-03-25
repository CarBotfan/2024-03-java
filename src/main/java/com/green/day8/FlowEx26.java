package com.green.day8;

public class FlowEx26 {
    public static void main(String[] args) {
        /*
        1~1000
        값들을 계속 더해서 더한 값이 100 미만인 index값이 몇인지 구하시오.
         */
        int sum = 0;
        int i = 1;
        final int NUM = 104;
        while(sum + i < NUM) {
            sum += i;
            if(sum + i + 1 >= NUM) {
                System.out.println(i);
            }
            i++;
        }
    }
}
