package com.brainacad.andreyaa.lms.java_fundamentals.lab1_6_arrays;

import java.util.Arrays;

public class lab1_6_6 {
    public static void main(String[] args) {

        double[] temperatureArray = {-6.5, -6.7, -1.4, 6.6, 13.1, 17.0,
                19.3, 17.4, 11.3, 6.0, -1.2, -5.3};
        Arrays.sort(temperatureArray);

        for (double temperatures : temperatureArray) {
            System.out.println(temperatures);
        }

    }
}
