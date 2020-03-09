package com.brainacad.andreyaa.lms.java_fundamentals.lab2_14_generics.lab2_14_2_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Lab 2-14-2
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

        System.out.println(Arrays.toString(array1));
        System.out.println("Number of elements that are greater than maxElem: " +
                MyTestMethod.calcNum(array1, 3));

        System.out.println(Arrays.toString(array2));
        System.out.println("Number of elements that are greater than maxElem: " +
                MyTestMethod.calcNum(array2, 7.0));


        // Lab 2-14-3
        System.out.println();
        System.out.println("Sum of elements that are greater than maxElem: " +
                MyTestMethod.calcSum(array1, 3));
        System.out.println("Sum of elements that are greater than maxElem: " +
                MyTestMethod.calcSum(array2, 7));

    }

}


class MyTestMethod {

    static <T extends Comparable<T>> int calcNum(T[] array, T maxElem) {

        int counter = 0;

        for (T element : array) {
            if (element.compareTo(maxElem) > 0) {
                ++counter;
            }
        }

        return counter;

    }

    static <T extends Number> double calcSum(T[] array, T maxElem) {

        double sum = 0;

        for (Number element : array) {
            if (element.doubleValue() > maxElem.doubleValue()) {
                sum += element.doubleValue();
            }
        }

        return sum;

    }

}