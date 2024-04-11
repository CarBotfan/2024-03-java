package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {
    public static final int INIT_RECEIVE_CARD_COUNT = 2;
    public void play() {
        System.out.println("====== BlackJack =======");
        CardDeck carddeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Scanner scan = new Scanner(System.in);
        Rule rule = new Rule();
        initPhase(carddeck, gamer, dealer);
        playingPhase(carddeck, gamer);
        rule.whoIsWinner(gamer, dealer);
    }
    private void initPhase(final CardDeck carddeck, final Gamer gamer, final Dealer dealer) {
        System.out.printf("처음 %d장의 카드를 각자 뽑겠습니다.\n", INIT_RECEIVE_CARD_COUNT);
        for(int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            gamer.receiveCard(carddeck.draw());
            dealer.receiveCard(carddeck.draw());
        }
        while(dealer.canReceiveMoreCard()) {
            dealer.receiveCard(carddeck.draw());
        }
    }
    private void playingPhase(final CardDeck carddeck, final Gamer gamer) {
        Scanner scan = new Scanner(System.in);
        String str;
        while(true) {
            System.out.println(gamer.openCards());
            System.out.print("카드를 뽑겠습니까? 종료를 원하면 0을 입력하세요 >>");
            str = scan.nextLine();
            if("0".equals(str)) {
                break;
            }
            gamer.receiveCard(carddeck.draw());
            if(gamer.getScore() > 21) {
                break;
            }
        }
        scan.close();
    }


}

