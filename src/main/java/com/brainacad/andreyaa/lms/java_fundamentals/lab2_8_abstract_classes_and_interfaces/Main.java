package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Lab 2-8-2
        System.out.println("------------ Lab 2-8-2 ------------");
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle("Red", 11, 22);
        shapes[1] = new Triangle("Black", 5, 5, 5);
        shapes[2] = new Circle("Green", 10);

        for (Shape aShape : shapes) {
            aShape.draw();
        }
        System.out.println();

        // Lab 2-8-3
        System.out.println("------------ Lab 2-8-3 ------------");
        Rectangle rectangle1 = new Rectangle("Red", 1, 2);
        Rectangle rectangle2 = new Rectangle("Red", 2, 1);
        int result = rectangle1.compareTo(rectangle2);

        if (result == 1) {
            System.out.println("The area of rectangle1 is greater than rectangle2 " + "(" + result + ")");
        }
        if (result == -1) {
            System.out.println("The area of rectangle1 is less than rectangle2 " + "(" + result + ")");
        }
        if (result == 0) {
            System.out.println("The area of rectangle1 equals rectangle2 " + "(" + result + ")");
        }
        System.out.println();

        System.out.println("------------ Lab 2-8-4 ------------");
        Rectangle[] rectangles = new Rectangle[6];
        rectangles[0] = new Rectangle("Red", 10, 10);
        rectangles[1] = new Rectangle("Red", 11, 22);
        rectangles[2] = new Rectangle("Red", 100, 5);
        rectangles[3] = new Rectangle("Red", 5, 8);
        rectangles[4] = new Rectangle("Red", 2, 3);
        rectangles[5] = new Rectangle("Red", 1, 2);

        Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
        System.out.println();

        System.out.println("------------ Lab 2-8-5 ------------");
        ShapeColorComparator comparator = new ShapeColorComparator();
        Shape[] shapesColors = {new Rectangle("Red", 1, 2),
                new Rectangle("Blue", 1, 2),
                new Rectangle("Green", 1, 2),
                new Rectangle("Black", 2, 4),
                new Circle("Orange", 15),
                new Circle("Yellow", 10),
                new Circle("White", 5),
                new Triangle("Red", 2, 3, 4),
                new Triangle("Purple", 4, 5, 6),
                new Triangle("Crimson", 1, 2, 3)};

        Arrays.sort(shapesColors, comparator);

        for (Shape shapeColor : shapesColors) {
            System.out.println(shapeColor.getShapeColor());
        }

    }

}

