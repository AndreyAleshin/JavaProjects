package com.brainacad.andreyaa.lms.java_fundamentals.lab2_6_packages.example.testpack;

import com.brainacad.andreyaa.lms.java_fundamentals.lab2_6_packages.com.brainacad.carpack.Car;
import com.brainacad.andreyaa.lms.java_fundamentals.lab2_6_packages.example.applepack.Apple;

public class Main {

    public static void main(String[] args) {

        // Lab 2-6-1
        Apple apple = new Apple();
        Car car = new Car();

        apple.setMass(0.2);
        car.setMass(2550.8);
        System.out.println(apple.getMass());
        System.out.println(car.getMass());



    }

}
