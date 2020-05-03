package com.brainacad.andreyaa.labs.lab5;

/**
 * A simple class to describe a filter in aquarium
 *
 * @author Andrey Aleshin
 */
class Filter {

    private int power;
    private int performance;

    public void cleanWater() {
        System.out.println("Water is clean!");
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public int getPerformance() {
        return performance;
    }
    public void setPerformance(int performance) {
        this.performance = performance;
    }

}
