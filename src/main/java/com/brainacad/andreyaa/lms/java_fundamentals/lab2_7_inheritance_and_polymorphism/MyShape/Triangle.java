package com.brainacad.andreyaa.lms.java_fundamentals.lab2_7_inheritance_and_polymorphism.MyShape;

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "This is a Triangle, " +
                "color: " + getShapeColor().toUpperCase() +
                ", a = " + (int) a +
                ", b = " + (int) b +
                ", c = " + (int) c +
                ", area is " + calcArea();
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
