package com.brainacad.andreyaa.lms.java_basics.lab1_5_control_flow_statements;

import java.util.Scanner;

public class lab1_5_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum;
        for (int i = 1; i < n; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.printf("%d ", i);
            }
        }
    }
}
