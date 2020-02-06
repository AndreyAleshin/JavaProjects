package com.brainacad.andreyaa.lms.java_fundamentals.lab2_4_static_methods_and_fields;

public class MyMath {

    private final static double PI = 3.14;

    public static int findMin(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) minValue = value;
        }
        return minValue;
    }

    public static int findMax(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) maxValue = value;
        }
        return maxValue;
    }

    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

}
