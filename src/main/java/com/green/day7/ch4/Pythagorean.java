package com.green.day7.ch4;
import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c = scan.nextInt();

        int b_square = c * c - a * a;

        System.out.println(b_square);

    }
}
