package com.brainacad.andreyaa.lms.java_fundamentals.lab2_4_static_methods_and_fields;

public class GravityCalculator {

    public static void calcDist(double fallingTime) {

        double gravity = -9.81;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;
        double x;

        x = 0.5 * gravity * (fallingTime * fallingTime)
                + (initialVelocity * fallingTime) + initialPosition;

        System.out.println("The distance an object will fall in Earth's gravity: " + x + " m");

    }

}
