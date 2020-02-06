package com.brainacad.andreyaa.lms.java_fundamentals.lab2_10_wrapper_classes;

class Circle extends Shape implements Comparable, Drawable {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is a Circle, " +
                "color: " + getShapeColor().toUpperCase() +
                ", radius = " + (int) radius +
                ", area is " + calcArea();
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)(o);
        if (this.radius > circle.radius) return 1;
        if (this.radius < circle.radius) return -1;
        return 0;
    }

    static Circle parseCircle(String str) {
        String[] numericalParameters = parseNumericalParameters(str);
        return new Circle(parseColor(str),
                Double.parseDouble(numericalParameters[0]));
    }

}
