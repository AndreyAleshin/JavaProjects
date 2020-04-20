package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_4;

import java.io.*;

class Main {

    public static void main(String[] args) {

        UserSerialize user1 = new UserSerialize("Bob", "Moon", 45);
        UserSerialize user2 = new UserSerialize("Bob", "Boom", 35);
        UserSerialize user3 = new UserSerialize("Bob", "Zoom", 25);

        String filePath = "D:\\AAA\\users.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(user1);
            oos.writeObject(user2);
            oos.writeObject(user3);

            System.out.println("Serialization complete!");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {

            UserSerialize newUser1 = (UserSerialize) ois.readObject();
            UserSerialize newUser2 = (UserSerialize) ois.readObject();
            UserSerialize newUser3 = (UserSerialize) ois.readObject();

            System.out.println("Starting deserialization: ");

            System.out.printf("First name: %s \t Last name: %s \t Age: %d",
                    newUser1.getFirstName(),
                    newUser1.getLastName(),
                    newUser1.getAge());
            System.out.println();

            System.out.printf("First name: %s \t Last name: %s \t Age: %d",
                    newUser2.getFirstName(),
                    newUser2.getLastName(),
                    newUser2.getAge());
            System.out.println();

            System.out.printf("First name: %s \t Last name: %s \t Age: %d",
                    newUser3.getFirstName(),
                    newUser3.getLastName(),
                    newUser3.getAge());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
