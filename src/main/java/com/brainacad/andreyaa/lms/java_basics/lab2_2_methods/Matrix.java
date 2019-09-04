package com.brainacad.andreyaa.lms.java_basics.lab2_2_methods;

/**
 * This Matrix class contains two methods of addition
 * and multiplication of 2 two-dimensional matrices,
 * and Main method, where all the methods are executed.
 *
 * @author Andrey Aleshin
 */
public class Matrix {

    /**
     * Initial two-dimensional matrices
     */
    private int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    private int[][] matrixB = {
            {4, 5, 7},
            {6, 1, 8},
            {2, 3, 9}
    };

    /**
     * A simple method in which 2 two-dimensional matrices
     * are summed. For example:
     * | 1 2 | + | 5 6 | = | (1+5) (2+6) | = | 6 8 |
     * | 3 4 |   | 7 8 |   | (3+7) (4+8) |   |10 12|
     *
     * @param matrixA 3x3 [][] array
     * @param matrixB 3x3 [][] array
     * @return summed matrixSum
     */
    public static int[][] sumMatrix(int[][] matrixA, int[][] matrixB) {

        int[][] matrixSum = new int[2][2];

        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] = 0;
            }
        }

        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] += matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixSum;
    }

    /**
     * A simple method in which 2 two-dimensional matrices
     * are multiplied in each other. For example:
     *
     * | 3 2 | * | 1 4 | = | (3*1)+(2*6)  (3*4)+(2*2) | = | 15 16 |
     * | 1 5 |   | 6 2 |   | (1*1)+(5*6)  (1*4)+(5*2) |   | 31 14 |
     *
     * So the element with [0, 0] index is obtained by the multiplication
     * of a row in first matrix on a column in second etc.
     *
     * In order to be able to multiply matrices, the number of columns in
     * the first matrix has to equal the number of rows in the second matrix.
     *
     * @param matrixA 3x3 two-dimensional array
     * @param matrixB 3x3 two-dimensional array
     * @return multiplied matrixMul
     */
    public static int[][] mulMatrix(int[][] matrixA, int[][] matrixB) {

        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int columnsB = matrixB[0].length;

        if (columnsA != rowsB) {
            throw new IllegalArgumentException("matrixA rows: " + columnsA +
                    " didn't match matrixB columns " + rowsB);
        }

        int[][] matrixMul = new int[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                matrixMul[i][j] = 0;
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    matrixMul[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixMul;
    }


    /**
     * Main method to execute sumMatrix and mulMatrix methods
     * @param args
     */
    public static void main(String[] args) {

        Matrix matrix = new Matrix();


        System.out.println("matrixA + matrixB: \n");

        int[][] resultSum = sumMatrix(matrix.matrixA, matrix.matrixB);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultSum[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("\nmatrixA * matrixB: \n");

        int[][] resultMul = mulMatrix(matrix.matrixA, matrix.matrixB);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMul[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
