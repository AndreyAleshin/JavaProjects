package com.brainacad.andreyaa.lms.java_fundamentals.lab2_18_core_java_classes.lab2_18_4;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] programs = {"notepad.exe", "calc.exe"};

        try {

            System.out.print("Enter an application name you want to run: ");
            String app = scanner.nextLine();
            System.out.println("Executing");
            Process process = Runtime.getRuntime().exec(app);
            System.out.println("Application is opening");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
