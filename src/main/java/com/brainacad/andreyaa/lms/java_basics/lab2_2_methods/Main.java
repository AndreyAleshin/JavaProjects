package com.brainacad.andreyaa.lms.java_basics.lab2_2_methods;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {

        A test = new A();

        System.out.print("Square of a rectangle: ");
        System.out.println(test.calcSquare(2, 4));
        System.out.print("Square of a foursquare: ");
        System.out.println(test.calcSquare(5));
        System.out.print("Square of a circle: ");
        System.out.println(test.calcSquare(PI, 2));

    }
}

class A {

    public int calcSquare(int a, int b) {
        return a * b;
    }

    public int calcSquare(int x) {
        return x * x;
    }

    public double calcSquare(double PI, int r) {
        return PI * r * r;
    }
}

//class B {
//
//    public int calcSquare(final int x) {
//        x = 10; // final parameter x can't be assign
//        return x;
//    }
//}

