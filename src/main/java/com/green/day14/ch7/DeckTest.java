package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
//        Card c = new Card();
//        c.kind = "Spade";
//        c.number = "K";
//
//      System.out.println(c.toString());


        Card c1 = deck1.pick();
        System.out.println(c1);
        System.out.println(deck1.pick(5));
        deck1.shuffle();
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

    Card pick() {//카드 한 장 골라봐라...
        int random = (int)(Math.random() * cards.length);
        return cards[random];//파랑이 좋겠군
    }
    Card pick(int n) {
        return cards[n];
    }

    Card[] deckBuilder(Card[] cards) {
        String[] kinds = {"Spade", "Heart", "Club", "Diamond"};
        int idx = 0;
        for(int i = 0; i < kinds.length; i++) {
            for(int j = 13; j > 0;j--) {
                String number = switch(j) {
                    case 13 -> "K";
                    case 12 -> "Q";
                    case 11 -> "J";
                    case 1 -> "A";
                    default -> String.valueOf(j);
                };
                cards[idx++] = new Card(kinds[i], number);
            }
        }
        return cards;
    }
    Card[] shuffle() {

        for(int i = 0; i < cards.length; i++) {
            int random = (int)(Math.random() * cards.length);
            Card temp = cards[i];
            if(i == random) {continue;}
            cards[i] = cards[random];
            cards[random] = temp;
        }
        return cards;
    }
    void printAllCard() {
        for(Card c: cards) {
            System.out.println(c);
        }
    }
}

class Card extends Object{//입력 없이도 모든 클래스는 자동으로 object 상속

    String kind;
    String number;
    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;

    }
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }

}