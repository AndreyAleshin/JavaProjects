package com.brainacad.andreyaa.labs.lab4;

import java.util.Arrays;

/**
 * Basic class with Arrays and operations with them.
 *
 * @author Andrey Aleshin
 */
public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        System.out.println("PART 1\n" + "\nTask 1.1\n");
        float[] firstArray = new float[4];
        firstArray[0] = 3.2f;
        firstArray[1] = -7.1f;
        firstArray[2] = 9.9f;
        firstArray[3] = 5.6f;
        System.out.println("First array: " + Arrays.toString(firstArray));
        float secondArray[] = {1.2f, 3.92f, -6.3f, 8.65f};
        System.out.println("Second array: " + Arrays.toString(secondArray));

        // 1.2)
        System.out.println("\nTask 1.2\n");
        int[] intArray = {8, 3, 9, 1, 4, 7, 5, 2};
        System.out.println("intArray: " + Arrays.toString(intArray));
        int[] intArrayCopy = Arrays.copyOf(intArray, 8);
        System.out.println("intArrayCopy: " + Arrays.toString(intArrayCopy));

        // 1.3)
        System.out.println("\nTask 1.3\n");
        Arrays.sort(intArrayCopy);
        System.out.println("intArrayCopy sorted: " + Arrays.toString(intArrayCopy));

        // 1.4)
        System.out.println("\nTask 1.4\n");
        System.out.println("Demonstration of Arrays.toString: " + Arrays.toString(intArrayCopy));

        // 1.5)
        System.out.println("\nTask 1.5\n");
        if (Arrays.equals(intArray, intArrayCopy)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal\n");
        }


        // PART 2
        System.out.println("\nPART 2\n" + "\nTask 2.1\n");
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};
        System.out.println("Initial Array (testArray): ");
        for (int value : testArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 2.1)
        System.out.println("\nTask 2.1\n");
        int sum1 = 0;
        for (int value : testArray) {
            sum1 += value;
        }
        System.out.println("Sum of all elements in testArray: " + sum1);

        // 2.2)
        System.out.println("\nTask 2.2\n");
        int sum2 = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (i % 2 != 0) {
                sum2 += testArray[i];
            }
        }
        System.out.println("Sum of all numbers with odd indexes in testArray: " + sum2);

        // 2.3)
        System.out.println("\nTask 2.3\n");
        int max = testArray[0];
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > max) {
                max = testArray[i];
            }
        }
        System.out.println("Max value in testArray is: " + max + "\n");

        // PART 3
        System.out.println("\nPART 3");

        //3.1
        int[][] twoDimArray = {
                {-9, 1, 0, 7},
                {8, -5, 3, 2},
                {-6, 1, 8, 4}
        };

        //3.2
        System.out.println("\nTask 3.1 (3.2)\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }

        //3.3
        System.out.println("\nTask 3.3\n");
        int sum3 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum3 += twoDimArray[i][j];
            }
        }
        System.out.println("Sum of all elements in twoDimArray: " + sum3 + "\n");


        // PART 4*
        System.out.println("\nPART 4\n");

        long[][] matrix = new long[9][9];
        int ratio = 0;
        long sum4 = 0;
        long max2;
        max2 = matrix[0][0];
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }
        for (int i = 0; i < matrix.length; i++) {
            if ((i > 2) && (i <= 5)) {
                for (int j = 0; j < matrix.length; j++) {
                    if (j % 3 == 0) {
                        long min;
                        min = matrix[3][3];
                        System.out.print(matrix[i][j] + "\t");
                        if (matrix[i][j] > max2) max2 = matrix[i][j];
                        if (matrix[i][j] < min) min = matrix[i][j];
                        sum4 = max2 + min;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("\nSum of max and min values is: " + sum4);

    }

}
