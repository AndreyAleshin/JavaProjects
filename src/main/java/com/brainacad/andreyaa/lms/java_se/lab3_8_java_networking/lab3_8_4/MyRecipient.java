package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class MyRecipient {

    public static void main(String[] args) {

        try {

            DatagramSocket datagramSocket = new DatagramSocket(8888);
            byte[] buffer = new byte[1024];

            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(datagramPacket);
                String text = new String(datagramPacket.getData());
                System.out.println("Received: " + text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
