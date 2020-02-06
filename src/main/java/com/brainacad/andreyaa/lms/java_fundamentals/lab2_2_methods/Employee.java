package com.brainacad.andreyaa.lms.java_fundamentals.lab2_2_methods;

public class Employee {

    private String name;
    private double salary;

    public Employee(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public double calcSalary(double... salary) {
        double sumSalary = 0;
        for (double s : salary) {
            sumSalary += s;
        }
        return sumSalary;
    }

}
