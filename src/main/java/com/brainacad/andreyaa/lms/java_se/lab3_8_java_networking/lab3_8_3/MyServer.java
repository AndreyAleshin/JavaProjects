package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class MyServer {

    private ServerSocket serverSocket;

    public static void main(String[] args) {
        MyServer server = new MyServer(8888);
        server.handlingQuery();

        // https://www.journaldev.com/741/java-socket-programming-server-client
        // https://kodejava.org/how-do-i-create-a-client-server-socket-communication/

    }

    private MyServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handlingQuery() {

        System.out.println("Waiting for client message...");

        while (!serverSocket.isClosed()) {
            try {
                Socket clientSocket = serverSocket.accept();
                new ServerThread(clientSocket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}


class ServerThread implements Runnable  {

    private final Socket clientSocket;

    ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        try {

            DataInputStream serverDIS = new DataInputStream(clientSocket.getInputStream());
            String message = serverDIS.readUTF();
            System.out.println("Message from client: " + message);

            DataOutputStream serverDOS = new DataOutputStream(clientSocket.getOutputStream());
            serverDOS.writeUTF(message + "-PONG");

            serverDIS.close();
            serverDOS.close();
            clientSocket.close();

            System.out.println("Waiting for client message...");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}