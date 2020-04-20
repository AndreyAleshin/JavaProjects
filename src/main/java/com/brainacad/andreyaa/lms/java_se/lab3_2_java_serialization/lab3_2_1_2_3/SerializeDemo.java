package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_1_2_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Ivan");
        employee.setAddress("Lenina prospekt");
        employee.setSSN(12345);
        employee.setNumber(67890);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\AAA\\Employee.ser"))) {
            oos.writeObject(employee);
            System.out.print("Serialization complete");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
