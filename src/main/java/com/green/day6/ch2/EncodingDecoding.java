package com.green.day6.ch2;

public class EncodingDecoding {
    public static void main(String[] args) {
        char c = 'B';
        int i = c;

        char c2 = (char)i;
        System.out.printf("%c %d %c\n", c, i, c2);
    }
}
