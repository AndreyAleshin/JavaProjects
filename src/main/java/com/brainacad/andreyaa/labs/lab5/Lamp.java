package com.brainacad.andreyaa.labs.lab5;

/**
 * A simple class to describe a lamp installed in aquarium
 *
 * @author Andrey Aleshin
 */
public class Lamp {

    private int power;
    private String lampType;
    private boolean condition;

    public void isOn() {
        System.out.println("Lamp is on");
    }
    public void isOff() {
        System.out.println("Lamp is off");
    }

    public String getLampType() {
        return lampType;
    }
    public void setLampType(String lampType) {
        this.lampType = lampType;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

//    public boolean condition(String lampOff, String lampOn) {
//        if(condition) System.out.println("Lamp is off");
//    }



}
