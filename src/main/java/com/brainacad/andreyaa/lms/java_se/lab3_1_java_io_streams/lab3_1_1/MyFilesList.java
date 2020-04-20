package com.brainacad.andreyaa.lms.java_se.lab3_1_java_io_streams.lab3_1_1;

import java.io.File;

class MyFilesList {

    public static void main(String[] args) {

        File file = new File("D:\\");

        if (file.isDirectory()) {
            for (String s : file.list()) {
                System.out.println(s);
            }
        }

    }

}
