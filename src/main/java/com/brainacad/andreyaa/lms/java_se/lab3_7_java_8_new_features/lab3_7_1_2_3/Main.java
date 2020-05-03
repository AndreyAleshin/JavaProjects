package com.brainacad.andreyaa.lms.java_se.lab3_7_java_8_new_features.lab3_7_1_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Main {

    public static void main(String[] args) {

        // Lab 3-7-1
        System.out.println("------------ Lab 3-7-1 ------------");
        System.out.println("Integer array: ");
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 10);
            array[i] = random;
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array, (item1, item2) -> item2 - item1);
        System.out.println(Arrays.toString(array) + "\n");

        System.out.println("List of strings: ");

        List<String> strings = new ArrayList<>();

        strings.add("bcd");
        strings.add("a");
        strings.add("abcd");
        strings.add("ca");

        Collections.sort(strings, (s1, s2) -> s2.length() - s1.length());
        System.out.println(strings + "\n");


        // Lab 3-7-2
        System.out.println("------------ Lab 3-7-2 ------------");
        sumEven(array, number -> number % 2 == 0);
        printJStr(strings, letter -> letter.startsWith("a"));
        System.out.println();

        // Lab 3-7-3
        System.out.println("------------ Lab 3-7-3 ------------");

//        MyConverter converter = new MyConverter() {
//            @Override
//            public String convertStr(String str) {
//                return str.toUpperCase();
//            }
//        };
//        converter.convertStr(strings.get(0));
//        System.out.println(strings.get(1));

        // UnaryOperator<String>
//        strings.replaceAll(string -> string.toUpperCase());
//        System.out.println(strings);

        updateList(strings);
    }

    // Lab 3-7-2
    private static void sumEven(Integer[] array, Predicate<Integer> isEven) {
        int sumOfEven = 0;
        for (int value : array) {
            if (isEven.test(value)) {
                sumOfEven += value;
            }
        }
        System.out.println(sumOfEven);
    }

    // Lab 3-7-2
    private static void printJStr(List<String> strings, Predicate<String> isLetter) {
        for (String string : strings) {
            if (isLetter.test(string)) {
                System.out.println(string);
            }
        }
    }

    // Lab 3-7-3
    private static void updateList(List<String> strings) {
        strings.forEach(string -> System.out.println(string.toUpperCase()));
    }

}
