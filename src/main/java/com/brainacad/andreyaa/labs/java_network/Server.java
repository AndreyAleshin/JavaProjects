package com.brainacad.andreyaa.labs.java_network;

import java.io.*;
import java.net.*;

class Server {

    public static void main(String[] args) {

        // creation of sever socket
        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String input, output;

            System.out.println("Wait for messages");
            while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;
                out.println("Response ::: " + "echo -> " + input);
                System.out.println(input);
            }

        } catch (IOException e) {
            System.out.println("Error on a server");
            System.exit(-1);
        }

    }

}
