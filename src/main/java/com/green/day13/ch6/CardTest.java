package com.green.day13.ch6;

public class CardTest {
    public static void main(String[] args) {
        String[] shape = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] number = {"K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "A"};
        Card[] deck = new Card[shape.length * number.length];
        int x = 0;
        for(int i = 0; i < shape.length; i++) {
            for(int j = 0; j < number.length; j++) {
                deck[x++] = newCard(shape[i], number[j]);
            }
        }
        for(Card card : deck) {
            System.out.println(card.number + " of " + card.shape);
        }
        int randomNum =(int)(Math.random() * deck.length);
        System.out.println(deck[randomNum].shape + " " + deck[randomNum].number);

    }
    static Card newCard(String shape, String number) {
        Card card = new Card();
        card.shape = shape;
        card.number = number;
        return card;
    }
}
