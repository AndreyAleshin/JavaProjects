package com.brainacad.andreyaa.lms.java_se.lab3_6_annotations.lab3_6_1;

class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

//        System.out.println(findMax(1, 2, 3, 4, 5));
        System.out.println(findMax(1.1, -2.2, 3.3, -4.4));

    }

    @Deprecated
    private static int findMax(int... array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    @SafeVarargs
    private static <T extends Comparable<T>> T findMax(T... array) {
        T max = array[0];
        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

}
