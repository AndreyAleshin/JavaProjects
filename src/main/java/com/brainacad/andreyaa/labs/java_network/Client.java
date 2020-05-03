package com.brainacad.andreyaa.labs.java_network;

import java.io.*;
import java.net.*;

class Client {

    public static void main(String[] args) {

        System.out.println("Enter your text to send it to the server. Write 'exit' to close.");

        // creation of client socket
        try (Socket connectToServerSocket = new Socket("localhost", 8888);
             BufferedReader in = new BufferedReader(new InputStreamReader(connectToServerSocket.getInputStream()));
             PrintWriter out = new PrintWriter(connectToServerSocket.getOutputStream(), true);
             BufferedReader inu = new BufferedReader(new InputStreamReader(System.in))) {

            String userInput, serverOutput;

            while ((userInput = inu.readLine()) != null) {
                out.println(userInput);
                serverOutput = in.readLine();
                System.out.println(serverOutput);
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
