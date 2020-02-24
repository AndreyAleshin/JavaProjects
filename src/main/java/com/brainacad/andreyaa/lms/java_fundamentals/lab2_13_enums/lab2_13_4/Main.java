package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_4;

public class Main {

    public static void main(String[] args) {

        Card[] cards = new Card[52];
        int amount = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[amount] = new Card(rank, suit);
                amount++;
            }
        }

        for (Card card : cards)
            System.out.println(card);

    }

}
