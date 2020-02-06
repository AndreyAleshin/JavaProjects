package com.brainacad.andreyaa.lms.java_fundamentals.lab1_6_arrays;

public class lab1_6_7 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.print(arr[i][j]+" ");
                if (arr[i][j] == 1) {
                    System.out.print("[" + j + "]");
                }
            }
            System.out.println();
        }

    }
}
