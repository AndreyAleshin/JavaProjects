package com.brainacad.andreyaa.lms.java_basics.lab1_2_simple_console_application;

import java.util.Scanner;

public class lab1_2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name of a student: ");
        String line = sc.nextLine();

        System.out.println(line);
    }
}
