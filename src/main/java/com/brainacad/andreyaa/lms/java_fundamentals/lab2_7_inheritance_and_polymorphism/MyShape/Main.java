package com.brainacad.andreyaa.lms.java_fundamentals.lab2_7_inheritance_and_polymorphism.MyShape;

public class Main {

    public static void main(String[] args) {

        // Lab 2-7-6
        System.out.println("------------ Lab 2-7-6 ------------");
        Shape shape = new Shape("Red");
        System.out.println(shape.toString());
        System.out.println(shape.calcArea() + "\n");

        // Lab 2-7-7
        System.out.println("------------ Lab 2-7-7 ------------");
        Circle circle = new Circle("Green", 10);
        System.out.println(circle.toString() + "\n");

        // Lab 2-7-8
        System.out.println("------------ Lab 2-7-8 ------------");
        Rectangle rectangle = new Rectangle("Blue", 11, 22);
        System.out.println(rectangle.toString() + "\n");

        // Lab 2-7-9
        System.out.println("------------ Lab 2-7-9 ------------");
        Triangle triangle = new Triangle("Black", 5, 5, 5);
        System.out.println(triangle.toString() + "\n");


        // Lab 2-7-10
        System.out.println("------------ Lab 2-7-10 ------------");
        Shape[] shapes = new Shape[9];
        shapes[0] = new Rectangle("Red", 11, 22);
        shapes[1] = new Rectangle("Red", 11, 22);
        shapes[2] = new Rectangle("Red", 11, 22);
        shapes[3] = new Rectangle("Red", 11, 22);
        shapes[4] = new Rectangle("Red", 11, 22);
        shapes[7] = new Triangle("Black", 5, 5, 5);
        shapes[8] = new Triangle("Black", 5, 5, 5);
        shapes[5] = new Circle("Green", 10);
        shapes[6] = new Circle("Green", 10);

        for (Shape aShape : shapes) {
            System.out.println(aShape.toString());
        }

        double sumArea = 0.0;
        for (Shape aShape : shapes) {
            sumArea += aShape.calcArea();
        }
        System.out.println("\nThe total area of all shapes is: " +
                String.format("%.3f", sumArea));

        double sumRectArea = 0.0;
        double sumCircleArea = 0.0;
        double sumTriangleArea = 0.0;
        for (Shape aShape : shapes) {
            if (aShape instanceof Rectangle) {
                sumRectArea += aShape.calcArea();
            } else if (aShape instanceof Triangle) {
                sumTriangleArea += aShape.calcArea();
            } else if (aShape instanceof Circle) {
                sumCircleArea += aShape.calcArea();
            }
        }
        System.out.println("\nThe total area of all Rectangles is: " +
                String.format("%.3f", sumRectArea) + "\n" +
                "The total area of all Circles is: " +
                String.format("%.3f", sumCircleArea) + "\n" +
                "The total area of all Triangles is: " +
                String.format("%.3f", sumTriangleArea) + "\n");

    }

}
