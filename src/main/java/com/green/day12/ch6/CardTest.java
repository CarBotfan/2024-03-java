package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.height);
        System.out.println(Card.width);

        Card card1 = new Card();
        System.out.println(card1.height);//사용은 가능하나 지양
        System.out.println(card1.width);//사용은 가능하나 지양
        card1.kind = "Spade";
        card1.number = 4;
        System.out.println(card1.kind);
        System.out.println(card1.number);
        System.out.println(Card.width);


    }
}
