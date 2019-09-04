package com.brainacad.andreyaa.labs.lab7.inheritance.devices;

public abstract class AbstractDevice {
    private String name;
    private Integer serial;

    protected AbstractDevice() {
        switchPower();
    }

    protected String getPasport() { return name + "#" + serial; }
    protected abstract void switchPower();
}
