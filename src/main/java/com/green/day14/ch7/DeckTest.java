package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
//        Card c = new Card();
//        c.kind = "Spade";
//        c.number = "K";
//
//        System.out.println(c.toString());
        deck1.printAllCard();

    }
}

class Deck {
    final int CARD_NUM;
    Card[] cards;
    Deck() {
        this.CARD_NUM = 52;
        this.cards = deckBuilder(new Card[CARD_NUM]);
    }

    Card[] deckBuilder(Card[] cards) {
        String[] kinds = {"Spade", "Heart", "Club", "Diamond"};
        int idx = 0;
        for(int i = 0; i < kinds.length; i++) {
            for(int j = 13; j > 0;j--) {
                Card card = new Card();
                card.kind = kinds[i];
                card.number = switch(j) {
                    case 13 -> "K";
                    case 12 -> "Q";
                    case 11 -> "J";
                    case 1 -> "A";
                    default -> String.valueOf(j);
                };
                cards[idx++] = card;
            }
        }
        return cards;
    }
    void printAllCard() {
        for(Card c: cards) {
            System.out.println(c.toString());
        }
    }
}

class Card {

    String kind;
    String number;
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }

}