package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_1_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Multithreaded server
 */
class MyServer {

    public static void main(String[] args) {
        new MyServer(8888);

        // https://www.geeksforgeeks.org/introducing-threads-socket-programming-java/
        // https://habr.com/ru/post/330676/
        // https://www.baeldung.com/a-guide-to-java-sockets

    }

    private MyServer(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Server awaiting connections...");

            while (!serverSocket.isClosed()) {
                Socket clientSocket = serverSocket.accept();

                System.out.println("A new client is connected: " + clientSocket);

                ObjectInputStream serverOIS = new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream serverOOS = new ObjectOutputStream(clientSocket.getOutputStream());

                Thread thread = new ClientThread(clientSocket, serverOIS, serverOOS);
                thread.start();

                System.out.println("Assigning new thread for this client.");
                System.out.println("Connection accepted.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


class ClientThread extends Thread {

    private final Socket clientSocket;
    private final ObjectInputStream serverOIS;
    private final ObjectOutputStream serverOOS;
    private List<Student> users = new ArrayList<>();

    ClientThread(Socket clientSocket, ObjectInputStream serverOIS, ObjectOutputStream serverOOS) {
        this.clientSocket = clientSocket;
        this.serverOIS = serverOIS;
        this.serverOOS = serverOOS;
    }

    @Override
    public void run() {

        while (!clientSocket.isClosed()) {

            try {

                System.out.println("Client OOS & OIS initialized");

                Student student = (Student) serverOIS.readObject();
                System.out.println("Client data received: " + student);

                if (student.getCourse().equals("Java")) {
                    student.setAccess("You are ALLOWED to use server service");
                    System.out.println("Student \"" + student.getName() +
                            "\" have access to the server");
                } else {
                    student.setAccess("You are NOT ALLOWED to use server service");
                    System.out.println("Student \"" + student.getName() +
                            "\" don't have access to the server.");
                }
                serverOOS.writeObject(student);
                clientSocket.close();

                System.out.println("\nWaiting for a new client to connect...");

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        try {
            serverOIS.close();
            serverOOS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
