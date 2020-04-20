package com.brainacad.andreyaa.lms.java_se.lab3_1_java_io_streams.lab3_1_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class MyFileCopy {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("D:\\AAA\\original.txt");
             FileOutputStream fos = new FileOutputStream("D:\\AAA\\copy.txt")) {

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
