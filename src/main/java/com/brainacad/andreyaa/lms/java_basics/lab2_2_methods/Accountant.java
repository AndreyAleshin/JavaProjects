package com.brainacad.andreyaa.lms.java_basics.lab2_2_methods;

public class Accountant {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob");

        System.out.println("Name of an employee: " + employee.getName());
        System.out.println("Salary: " + employee.calcSalary(100, 200, 300));

    }
}
