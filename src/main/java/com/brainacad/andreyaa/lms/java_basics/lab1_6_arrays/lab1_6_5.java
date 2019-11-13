package com.brainacad.andreyaa.lms.java_basics.lab1_6_arrays;

public class lab1_6_5 {
    public static void main(String[] args) {

        int[][] twoDimArray = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        System.out.println("Initial matrix: ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTransposed matrix: ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                System.out.print(twoDimArray[j][i] + "\t");
            }
            System.out.println();
        }

    }
}
