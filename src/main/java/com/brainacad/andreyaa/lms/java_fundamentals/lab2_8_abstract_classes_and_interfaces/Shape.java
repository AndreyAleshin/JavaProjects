package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces;

abstract class Shape implements Drawable {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract double calcArea();

    @Override
    public String toString() {
        return "Shape: " +
                "color is " + shapeColor.toUpperCase();
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    public String getShapeColor() {
        return shapeColor;
    }

}
