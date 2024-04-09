package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16;
    public boolean canReceiveMoreCard() {
        int currentPoint = 0;
        for(int i = 0; i < cards.size(); i++) {
            currentPoint += cards.get(i).getScore();
        }
        return (currentPoint <= CAN_RECEIVE_POINT);
    }
    public void dealerReceiveCard(CardDeck deck) {
        do {
            receiveCard(deck.draw());
        } while(canReceiveMoreCard());
    }

}


class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        CardDeck deck = new CardDeck();
        dealer.dealerReceiveCard(deck);
        System.out.println(dealer.openCards());
    }
}