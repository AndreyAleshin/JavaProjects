package com.brainacad.andreyaa.lms.java_basics.lab1_6_arrays;

public class lab1_6_1 {
    public static void main(String[] args) {

        int[] arr = new int[30];
        for (int i = 2, j = 0; i <= arr.length; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                System.out.print(arr[j] + " ");
                j++;
            }
        }
    }
}
