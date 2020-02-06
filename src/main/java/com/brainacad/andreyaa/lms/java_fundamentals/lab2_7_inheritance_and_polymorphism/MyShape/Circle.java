package com.brainacad.andreyaa.lms.java_fundamentals.lab2_7_inheritance_and_polymorphism.MyShape;

class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is a Circle, " +
                "color: " + getShapeColor().toUpperCase() +
                ", radius = " + (int) radius +
                ", area is " + calcArea();
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }


}
