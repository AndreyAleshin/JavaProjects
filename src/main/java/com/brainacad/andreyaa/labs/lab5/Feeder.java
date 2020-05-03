package com.brainacad.andreyaa.labs.lab5;

/**
 * A simple class to describe a feeder in aquarium
 *
 * @author Andrey Aleshin
 */
class Feeder {

    private int volume;
    private String model;

    public void pourFeed() {
        System.out.println("Fish has food!");
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

}
