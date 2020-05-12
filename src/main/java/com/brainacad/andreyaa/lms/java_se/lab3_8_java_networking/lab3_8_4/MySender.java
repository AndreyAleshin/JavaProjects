package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_4;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class MySender {

    private static String filePath = "D:\\AAA\\123.txt";

    public static void main(String[] args) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            DatagramSocket datagramSocket = new DatagramSocket();

            String text = bufferedReader.readLine();

            byte[] buffer = text.getBytes();

            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length,
                    InetAddress.getByName("localhost"), 8888);

            datagramSocket.send(datagramPacket);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
