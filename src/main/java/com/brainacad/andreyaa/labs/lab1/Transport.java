/*
 * Copyright (c) 2018, My Own company. All rights reserved.
 */
package com.brainacad.andreyaa.labs.lab1;

import java.util.Date;

/**
 * My first class for explain what perfect Java are!
 * {@link Transport } describes the universal form of transport.
 * This is JavaDoc looks like.
 *
 * @author Vladimir Bratchikov
 */
public abstract class Transport {

    public static final double HP_RATIO = 1.35_96d; // For kw to hp.

    // Basic transport properties
    private final TransportType type;
    private final String name;
    private final Date registrationDate = new Date();

    // Addition transport properties.
    private float power;
    private double carrying;
    private int maxSpeed;

    private Integer passengers;

    // for create like new Transport(...)
    public Transport(final TransportType type, final String name) {

        this.type = type;
        this.name = name;

        // start engine on create.
        startEngine();

    }

    /**
     * Abstract method, because different transport has a different engines.
     */
    public abstract void startEngine();

    /**
     * Send our transport to the road.
     */
    public void run() {
        // TODO go somewhere.
        System.out.println("Движемся только вперед");
    }

    /**
     * Stop our transport.
     */
    public void stop() {
        // TODO stop quickly.
        System.out.println("Немного притормозим");
    }

    /**
     * Convert current kw power of transport to hp analog by use {@value HP_RATIO}.
     *
     * @return horse power value of transport.
     */
    protected double convertPower() {
        return power * HP_RATIO;
    }

    // Getters and setters
    public float getPower() {
        return power;
    }

    public void setPower(final float power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(final Integer passengers) {
        this.passengers = passengers;
    }

}