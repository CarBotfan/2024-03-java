package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16;
    public boolean canReceiveMoreCard() {
        return(getScore() <= CAN_RECEIVE_POINT);
    }

}


class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        CardDeck deck = new CardDeck();
        dealer.receiveCard(deck.draw());
        System.out.println(dealer.openCards());
    }
}