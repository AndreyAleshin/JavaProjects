package com.brainacad.andreyaa.lms.java_se.lab1_2_java_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.ser"))) {

            Employee employee = new Employee();

            employee.setName("Ivan");
            employee.setAddress("Lenina prospekt");
            employee.setSNN(12345);
            employee.setNumber(67890);

            oos.writeObject(employee);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
