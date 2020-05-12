package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

class MyClient {

    public static final String HOST = "127.0.0.1";
    private static final int PORT = 8888;

    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.exchangeData();
    }

    void exchangeData() {
        try {

            for (int i = 1; i <= 10; i++) {
                Socket clientSocket = new Socket(HOST, PORT);

                DataOutputStream clientDOS = new DataOutputStream(clientSocket.getOutputStream());
                clientDOS.writeUTF("Client_" + i + " PING");

                DataInputStream clientDIS = new DataInputStream(clientSocket.getInputStream());
                String message = clientDIS.readUTF();

                System.out.println("Message from server: " + message);

                clientDOS.close();
                clientDIS.close();

                Thread.sleep(500);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
