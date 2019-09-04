package com.brainacad.andreyaa.labs.lab14;

public class Race {
    public static void main(String[] args) {

        RaceCarRunnable raceCarRunnable = new RaceCarRunnable("Car_N1", 250, 400);

        Thread car = new Thread(raceCarRunnable);
        car.start();
    }
}
