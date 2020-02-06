package com.brainacad.andreyaa.lms.java_fundamentals.lab2_5_initialization_sections;

import java.util.Arrays;

class MyInit {

    private int[] arr = new int[10];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

}
