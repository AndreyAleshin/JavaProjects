package com.brainacad.andreyaa.lms.java_fundamentals.lab2_7_inheritance_and_polymorphism.MyShape;

class Shape {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Shape: " +
                "color is " + shapeColor.toUpperCase();
    }

    public double calcArea() {
        System.out.print(this.getClass().getSimpleName() + " area is: ");
        return 0;
    }

    public String getShapeColor() {
        return shapeColor;
    }

}
