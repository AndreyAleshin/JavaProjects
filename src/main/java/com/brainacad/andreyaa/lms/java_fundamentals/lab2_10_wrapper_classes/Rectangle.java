package com.brainacad.andreyaa.lms.java_fundamentals.lab2_10_wrapper_classes;

class Rectangle extends Shape implements Comparable, Drawable {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
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
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) (o);
        if (this.calcArea() > rectangle.calcArea()) return 1;
        if (this.calcArea() < rectangle.calcArea()) return -1;
        return 0;
    }

    static Rectangle parseRectangle(String str) {
        String[] numericalParameters = parseNumericalParameters(str);
        return new Rectangle(parseColor(str),
                Double.parseDouble(numericalParameters[0]),
                Double.parseDouble(numericalParameters[1]));
    }

}


