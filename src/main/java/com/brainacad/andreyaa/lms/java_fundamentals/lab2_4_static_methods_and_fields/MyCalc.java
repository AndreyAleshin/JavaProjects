package com.brainacad.andreyaa.lms.java_fundamentals.lab2_4_static_methods_and_fields;

public class MyCalc {

    public static double calcPi(int n) {

        int odd = 1;
        double pi = 0.0;

        for (int i = 1; i <= n; i++) {
            double currentTerm;
            if (i % 2 == 0) {
                currentTerm = (double) -4 / odd;
            } else {
                currentTerm = (double) 4 / odd;
            }
            odd = odd + 2;
            pi += currentTerm;
        }
        return pi;

    }

}
