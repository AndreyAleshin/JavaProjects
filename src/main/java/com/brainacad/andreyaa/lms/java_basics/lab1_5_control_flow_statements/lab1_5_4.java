package com.brainacad.andreyaa.lms.java_basics.lab1_5_control_flow_statements;

public class lab1_5_4 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i + " ");
                sum++;
            }
            if (sum == 10) {
                break;
            }
        }
    }
}
