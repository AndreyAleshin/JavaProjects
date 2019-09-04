package com.brainacad.andreyaa.lms.java_basics.lab1_6_arrays;

public class lab1_6_3 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
