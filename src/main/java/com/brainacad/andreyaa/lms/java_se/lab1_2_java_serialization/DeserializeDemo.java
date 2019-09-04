package com.brainacad.andreyaa.lms.java_se.lab1_2_java_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.ser"))) {
            Employee employee = (Employee) new Employee();
            System.out.printf("Name: %s \t Address: %s \t SSN: %d \t Number: %d \n",
                    employee.getName(), employee.getAddress(), employee.getSNN(),
                    employee.getNumber());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
