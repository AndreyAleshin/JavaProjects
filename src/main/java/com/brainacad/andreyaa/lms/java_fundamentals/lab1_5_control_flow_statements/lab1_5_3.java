package com.brainacad.andreyaa.lms.java_fundamentals.lab1_5_control_flow_statements;

/**
 * A multiplication table of 1 to 9
 *
 * @author Andrey Aloshyn
 */
public class lab1_5_3 {
    public static void main(String[] args) {

        int mult = 1;
        System.out.print("* | ");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |    \t");
        }
        System.out.println();

        System.out.println("======================================" +
                "=================================");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                mult = i * j;
                System.out.print(mult + " | \t");
            }
            System.out.println();
        }

    }
}
