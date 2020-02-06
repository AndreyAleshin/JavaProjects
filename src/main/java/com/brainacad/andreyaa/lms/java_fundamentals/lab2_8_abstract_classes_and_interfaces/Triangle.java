package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces;

class Triangle extends Shape implements Comparable, Drawable {

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
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
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
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) (o);
        if (this.calcArea() > triangle.calcArea()) return 1;
        if (this.calcArea() < triangle.calcArea()) return -1;
        return 0;
    }

}

