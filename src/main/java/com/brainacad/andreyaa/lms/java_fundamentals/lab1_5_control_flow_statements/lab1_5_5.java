package com.brainacad.andreyaa.lms.java_fundamentals.lab1_5_control_flow_statements;

public class lab1_5_5 {
    public static void main(String[] args) {

        int sum = 0;
        double average;
        int initialValue = 1;
        double upperBound = 19;

        for (int number = initialValue; number <= upperBound; number++) {
            sum += number;
        }
        average = sum / upperBound;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);

//        int initialValue = 1;
//        double upperBound = 19;
//        int sum = 0;
//        double average;
//        int number = initialValue;
//        while (number <= upperBound) {
//            sum += number;
//            ++number;
//        }
//        average = sum / upperBound;
//        System.out.println("The sum is: " + sum);
//        System.out.println("The average is: " + average);

//        int initialValue = 1;
//        double upperBound = 19;
//        int sum = 0;
//        double average;
//        int number = initialValue;
//        do {
//            sum += number;
//            ++number;
//        } while (number <= upperBound);
//        average = sum / upperBound;
//        System.out.println("The sum is: " + sum);
//        System.out.println("The average is: " + average);

    }

}
