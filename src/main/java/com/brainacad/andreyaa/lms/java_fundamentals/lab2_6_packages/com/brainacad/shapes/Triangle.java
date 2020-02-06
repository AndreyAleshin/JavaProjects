package com.brainacad.andreyaa.lms.java_fundamentals.lab2_6_packages.com.brainacad.shapes;

import static java.lang.Math.sqrt;

public class Triangle {

    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        double areaOfTriangle = sqrt(s * (s - a) * (s - b) * (s - c));
        return areaOfTriangle;
    }

}
