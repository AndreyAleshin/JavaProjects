package com.brainacad.andreyaa.lms.java_basics.lab2_13_enums;

public class Main {
    public static void main(String[] args) {

        for (MyDayOfTheWeek week : MyDayOfTheWeek.values()) {
            System.out.println(week);
        }
    }
}
