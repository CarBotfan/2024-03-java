package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private final String[] PATTERNS = {"Spade", "Heart", "Club", "Diamond"};
    private final int CARD_COUNT = 13;
    public CardDeck() {
        this.init();
    }


    private List<Card> init() {
        cards = new ArrayList();
        for(int i = 0; i < PATTERNS.length; i++) {
            for(int j = CARD_COUNT; j >= 1; j--) {
                String denomination = getDenomination(j);
                Card c = new Card(PATTERNS[i], denomination);
                cards.add(c);
            }
        }
        return cards;
    }

    private String getDenomination(int num) {
        return switch(num) {
            case 13 -> "K";
            case 12 -> "Q";
            case 11 -> "J";
            case 1 -> "A";
            default -> String.valueOf(num);
        };
    }

    public void shuffle() {
        for(int i = 0; i < cards.size(); i++) {
            int randomNum = (int)(Math.random()* cards.size());
            if(randomNum != i) {
                Card temp = cards.get(i);
                cards.set(i, cards.get(randomNum));
                cards.set(randomNum, temp);
            }
        }
    }
    public Card draw() {
        if(cards.size() == 0) {
            System.out.println("no Cards");
            return new Card("","");
        }
        int random = (int)(Math.random() * cards.size());

        return cards.remove(random);
    }
    public void putCard(Card c) {
        cards.add(c);
    }

    public void showCards() {
        for(int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }
    }

}

class deckTest{
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
//        deck.shuffle();
        deck.showCards();
        System.out.println("-----------------");
        Card c = deck.draw();
        System.out.println(c);
        System.out.println("------------------");
        deck.putCard(c);
        deck.showCards();
    }
}