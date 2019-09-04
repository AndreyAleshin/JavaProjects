package com.brainacad.andreyaa.labs.lab14;

public class Car {

    private String name; // name of a race car
    private int maxSpeed; // in km/h

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
