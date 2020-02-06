package com.brainacad.andreyaa.lms.java_fundamentals.lab1_6_arrays;

import java.util.Arrays;

public class lab1_6_4 {
    public static void main(String[] args) {

        int[] intArr = {4, 1, 45, 23, 86, 97, 42, 11, 18, 62, 77, 12, 5, 80, 33, 88};

        Arrays.sort(intArr);
        System.out.println("The sorted int array is: ");
        System.out.println(Arrays.toString(intArr));

        int searchVal = 12;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The index of element " + searchVal + " is: " + retVal);

    }
}
