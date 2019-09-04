package com.github.andreyaleshin.HeadFirstJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("MyText.txt");
            writer.write("12345\n1234\n123\n12\n1");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
