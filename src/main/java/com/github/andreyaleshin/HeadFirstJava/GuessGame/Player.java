package com.github.andreyaleshin.HeadFirstJava.GuessGame;

public class Player {

    int number = 0; // the number variant stored here

    public void guess() {

        number = (int) (Math.random() * 10);
        System.out.println("I think the number is " + number);
    }
}
