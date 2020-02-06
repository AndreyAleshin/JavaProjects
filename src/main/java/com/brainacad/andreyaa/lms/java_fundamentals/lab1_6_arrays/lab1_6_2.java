package com.brainacad.andreyaa.lms.java_fundamentals.lab1_6_arrays;

public class lab1_6_2 {
    public static void main(String[] args) {

//        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
//        int max = m[0];
//        int min = m[0];
//        double avg;
//        int sum = 0;
//        for (int i = 0; i < m.length; i++) {
//            if (m[i] > max) max = m[i];
//            if (m[i] < min) min = m[i];
//            sum += m[i];
//        }
//        avg = (double) sum / m.length;
//        System.out.println("Maximum value from initial array: " + max);
//        System.out.println("Minimum value from initial array: " + min);
//        System.out.println("Average value of the array: " + avg);

        // Using enhanced FOR loop (for-each)
        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = m[0];
        int min = m[0];
        double avg;
        int sum = 0;

        for (int i : m) {
            if (i > max) max = i;
            if (i < min) min = i;
            sum += i;
        }

        avg = (double) sum / m.length;

        System.out.println("Maximum value from initial array: " + max);
        System.out.println("Minimum value from initial array: " + min);
        System.out.println("Average value of the array: " + avg);

    }
}
