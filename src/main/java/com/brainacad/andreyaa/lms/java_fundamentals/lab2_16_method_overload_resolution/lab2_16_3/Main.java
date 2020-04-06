package com.brainacad.andreyaa.lms.java_fundamentals.lab2_16_method_overload_resolution.lab2_16_3;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int a = 0, b = 0;

        foo(1, 2);
        foo(1, 2, 3, 4, 5);

    }

    static void foo(int a, int b) {
        System.out.println("a b");
    }

    static void foo(int... a) {
        System.out.println(Arrays.toString(a));
    }

}
