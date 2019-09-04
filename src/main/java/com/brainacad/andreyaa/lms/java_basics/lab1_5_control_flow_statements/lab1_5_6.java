package com.brainacad.andreyaa.lms.java_basics.lab1_5_control_flow_statements;

import java.util.Scanner;

public class lab1_5_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum1;
        int sum2 = 0;

        while (number != 0) {
            sum1 = 0;
            sum1 = sum1 + number % 10;
            sum2 += sum1 * sum1;
            number /= 10;

        }
        System.out.println("The sum of squares of digits of a number: " + sum2);
    }
}
