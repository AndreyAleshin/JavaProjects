package com.brainacad.andreyaa.lms.java_se.lab3_1_java_io_streams.lab3_1_2;

import java.io.FileReader;
import java.io.IOException;

class PrintFile {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("D:\\AAA\\123.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

