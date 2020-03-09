package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_1_2_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Lab 2-13-1
        System.out.println("------------ Lab 2-13-1 ------------");
        for (MyDayOfTheWeek dayOfTheWeek : MyDayOfTheWeek.values()) {
            System.out.println(dayOfTheWeek);
        }
        System.out.println();


        // Lab 2-13-2
        System.out.println("------------ Lab 2-13-2 ------------");
        for (MyDayOfTheWeek javaDay : MyDayOfTheWeek.values()) {
            switch (javaDay) {
                case TUESDAY:
                case THURSDAY:
                case SATURDAY:
                    System.out.println("My Java day: " + javaDay);
            }
        }
        System.out.println();


        // Lab 2-13-3
        System.out.println("------------ Lab 2-13-3 ------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        try {
            MyDayOfTheWeek today = MyDayOfTheWeek.valueOf(scanner.nextLine().toUpperCase());
            System.out.println("Next day is: " + today.nextDay());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR! Please type correct day of the week");
        }

    }

}
