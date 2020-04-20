package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_1_2_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializeDemo {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\AAA\\Employee.ser"))) {

            Employee employee = (Employee) ois.readObject();

            System.out.printf("Name: %s \t Address: %s \t SSN: %d \t Number: %d",
                    employee.getName(), employee.getAddress(), employee.getSSN(),
                    employee.getNumber());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
