package com.brainacad.andreyaa.lms.java_fundamentals.lab2_10_wrapper_classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Lab 2-10-1
        System.out.println("------------ Lab 2-10-1 ------------");
        Integer x1 = 10; // Caching Integer Objects (from -128 to 127, if higher -> new object is creating)
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);
        System.out.println(x2 == x3);
        System.out.println(x2 == x4);
        System.out.println(x3 == x4);
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x2.equals(x3));
        System.out.println(x2.equals(x4));
        System.out.println(x3.equals(x4));
        System.out.println();


        // Lab 2-10-2
        System.out.println("------------ Lab 2-10-2 ------------");
        System.out.println(compute((byte) 10, 20));
        System.out.println();


        // Lab 2-10-3
        System.out.println("------------ Lab 2-10-3 ------------");

        Shape rectangle = Shape.parseShape("Rectangle:RED:10,20");
        if (rectangle != null) {
            System.out.println(rectangle.toString());
        } else {
            System.out.println("Invalid string for creating a rectangle");
        }

        Shape triangle = Shape.parseShape("Triangle:GREEN:9,7,12");
        if (triangle != null) {
            System.out.println(triangle.toString());
        } else {
            System.out.println("Invalid string for creating a triangle");
        }

        Shape circle = Shape.parseShape("Circle:BLACK:10");
        if (circle != null) {
            System.out.println(circle.toString());
        } else {
            System.out.println("Invalid string for creating a circle");
        }
        System.out.println();


        // Lab 2-10-4
        System.out.println("------------ Lab 2-10-4 ------------");

        System.out.println(Rectangle.parseRectangle("Rectangle:RED:5,6"));
        System.out.println(Shape.parseShapeNew("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShapeNew("Rectangle:RED:33,44"));
        System.out.println();


        // Lab 2-10-5
        System.out.println("------------ Lab 2-10-5 ------------");

        int countOfShapes = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of objects to create: ");
        if (sc.hasNext()) {
            countOfShapes = Integer.parseInt(sc.nextLine());
        }

        Shape[] shapes = new Shape[countOfShapes];

        for (int i = 0; i < countOfShapes; i++) {
            System.out.print("Enter a string to create a Shape (Rectangle, Triangle or Circle): ");
            shapes[i] = Shape.parseShapeNew(sc.nextLine());
        }
        sc.close();

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }

    // Lab 2-10-2
    private static Long compute(Byte aByte, Integer anInteger) {
        return aByte.longValue() + anInteger.longValue();
    }

}
