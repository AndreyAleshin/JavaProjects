package com.brainacad.andreyaa.labs.java_network;

import java.net.URL;
import java.net.*;
import java.io.*;
import java.util.Date;

public class TestURLConnection {

    public static void main(String[] args) throws Exception {

        int c;
        URL url = new URL("https://code.jquery.com/jquery-3.3.1.min.js");
        URLConnection urlConnection = url.openConnection();

        System.out.println("Date: " + urlConnection.getDate());
        System.out.println("Type: " + urlConnection.getContentType());
        System.out.println("Expiration: " + urlConnection.getExpiration());
        System.out.println("Last modify: " + new Date(urlConnection.getLastModified()));
        System.out.println("Length: " + urlConnection.getContentLength());

        if (urlConnection.getContentLength() > 0) {
            System.out.println("===Content===");
            try (InputStream input = urlConnection.getInputStream()) {
                int i = urlConnection.getContentLength();
                while (((c = input.read()) != -1) && (-i > 0)) {
                    System.out.println((char) c);
                }
            }
        } else {
            System.out.println("No Content Available");
        }
    }
}
