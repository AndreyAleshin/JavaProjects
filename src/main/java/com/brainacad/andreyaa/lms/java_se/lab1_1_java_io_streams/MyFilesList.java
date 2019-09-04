package com.brainacad.andreyaa.lms.java_se.lab1_1_java_io_streams;

import java.io.File;

public class MyFilesList {
    public static void main(String[] args) {

        File f = new File("E:\\AndreyAleshin\\LabWork");

        if (f.isDirectory()) {
            for (String s : f.list()) {
                System.out.println(s);
            }
        }
    }
}
