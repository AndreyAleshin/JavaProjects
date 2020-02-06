package com.brainacad.andreyaa.lms.java_fundamentals.lab2_7_inheritance_and_polymorphism.MyShape;

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is a Rectangle, " +
                "color: " + getShapeColor().toUpperCase() +
                ", width = " + (int) width +
                ", height = " + (int) height +
                ", area is " + calcArea();
    }

    @Override
    public double calcArea() {
        return width * height;
    }

}
