package com.brainacad.andreyaa.lms.java_basics.lab2_1_classes_and_instances;

public class Bus {

    private int seats;
    private Person driver;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return this.seats;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
