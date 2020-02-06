package com.brainacad.andreyaa.lms.java_fundamentals.lab2_10_wrapper_classes;

import java.util.StringTokenizer;

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

    // Lab 2-10-3
    static Shape parseShape(String str) {

        StringTokenizer stringTokenizer1 = new StringTokenizer(str, ":");
        StringTokenizer stringTokenizer2 = new StringTokenizer(str.substring(str.lastIndexOf(":")
                + 1), ",");

        String[] parametersOfIncomingLine = new String[stringTokenizer1.countTokens()];
        String[] numericalParameters = new String[stringTokenizer2.countTokens()];

        int counter1 = 0;
        while (stringTokenizer1.hasMoreElements()) {
            parametersOfIncomingLine[counter1] = String.valueOf(stringTokenizer1.nextElement());
            counter1 = counter1 + 1;
        }

        int counter2 = 0;
        while (stringTokenizer2.hasMoreElements()) {
            numericalParameters[counter2] = String.valueOf(stringTokenizer2.nextElement());
            counter2 = counter2 + 1;
        }

        String typeObject = parametersOfIncomingLine[0];

        if (typeObject.equals("Rectangle")) {
            return new Rectangle(parametersOfIncomingLine[1],
                    Double.parseDouble(numericalParameters[0]),
                    Double.parseDouble(numericalParameters[1]));
        }
        if (typeObject.equals("Triangle")) {
            return new Triangle(parametersOfIncomingLine[1],
                    Double.parseDouble(numericalParameters[0]),
                    Double.parseDouble(numericalParameters[1]),
                    Double.parseDouble(numericalParameters[2]));
        }
        if (typeObject.equals("Circle")) {
            return new Circle(parametersOfIncomingLine[1],
                    Double.parseDouble(numericalParameters[0]));
        }

        return null;

    }

    static String parseColor(String str) {
        return str.substring(0, str.indexOf(":"));
    }

    static String[] parseNumericalParameters(String str) {

        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.lastIndexOf
                (":") + 1), ",");

        String[] numericalParameters = new String[stringTokenizer.countTokens()];

        int counter = 0;
        while (stringTokenizer.hasMoreElements()) {
            numericalParameters[counter] = String.valueOf(stringTokenizer.nextElement());
            counter = counter + 1;
        }
        return numericalParameters;
    }

    static Shape parseShapeNew(String str) {

        String typeObject = str.substring(0, str.indexOf(":"));
        String stringForParse = str.substring(str.indexOf(":") + 1);

        switch (typeObject) {
            case "Rectangle":
                return Rectangle.parseRectangle(stringForParse);
            case "Triangle":
                return Triangle.parseTriangle(stringForParse);
            case "Circle":
                return Circle.parseCircle(stringForParse);
        }
        return null;

    }

}
