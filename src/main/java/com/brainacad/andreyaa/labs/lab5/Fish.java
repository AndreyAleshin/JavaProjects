package com.brainacad.andreyaa.labs.lab5;

/**
 * A simple class to describe a fish
 *
 * @author Andrey Aleshin
 */
class Fish {

    private int length;
    private String color;

    public void swim() {
        System.out.println("Fish is swimming!");
    }
    public void eat() {
        System.out.println("Fish is eating!");
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
