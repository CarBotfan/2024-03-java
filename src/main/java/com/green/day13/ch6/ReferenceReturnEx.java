package com.green.day13.ch6;

import javax.swing.*;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Numbox nb = new Numbox();
        nb.num = 10;

        Numbox nb2 = myCopy(nb);
        System.out.println(nb.num);
        System.out.println(nb2.num);
        nb.num = 100;
        System.out.println(nb.num);
        System.out.println(nb2.num);
    }
    static Numbox myCopy(Numbox nbox) {
        Numbox nbox2 = new Numbox();
        nbox2.num = nbox.num;
        return nbox2;
    }
}



