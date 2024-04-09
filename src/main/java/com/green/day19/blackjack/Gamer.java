package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    protected List<Card> cards;
    public Gamer() {
        cards = new ArrayList();
    }
    public void receiveCard(Card card) {
        cards.add(card);
    }
    public List<Card> openCards() {
        return cards;
    }
}
class GamerTest {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        CardDeck deck = new CardDeck();
        gamer.receiveCard(new Card("Spade", "9"));
        gamer.receiveCard(new Card("Heart", "Q"));
        gamer.receiveCard(deck.draw());
        List<Card> cards = gamer.openCards();
        System.out.println(cards);
    }
}
