package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_1_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class MyClient {

    private List<Student> users = new ArrayList<>();

    public static void main(String[] args) {
        new MyClient("localhost", 8888);
    }

    MyClient(String host, int port) {
        try (Socket clientSocket = new Socket(host, port);
             ObjectOutputStream clientOOS = new ObjectOutputStream(clientSocket.getOutputStream());
             ObjectInputStream clientOIS = new ObjectInputStream(clientSocket.getInputStream())) {

            Student student = new Student("A", "Java", 1);
            System.out.println(student);

            clientOOS.writeObject(student);

            student = (Student) clientOIS.readObject();

            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
