package com.brainacad.andreyaa.labs.lab14;

import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable extends Car implements Runnable {

    private int passed;
    private int distance;
    private boolean isFinish;


    public RaceCarRunnable(String name, int maxSpeed, int distance) {
        super(name, maxSpeed);
        this.distance = distance;
    }

    public int getPassed() {
        return passed;
    }

    public int getDistance() {
        return distance;
    }

    public int getRandomSpeed() {

        int randomSpeed = ThreadLocalRandom.current().nextInt(getMaxSpeed() / 2, getMaxSpeed());
        return randomSpeed;
    }

    @Override
    public String toString() {
        return "RaceCarRunnable{" +
                "Car name: " + getName() +
                ", speed: " + getRandomSpeed() +
                ". Passed distance = " + passed +
                ", total distance = " + distance +
                '}';
    }

    @Override
    public void run() {

        while (!isFinish) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getRandomSpeed());
        }
        System.out.print("Finished");
    }
}
