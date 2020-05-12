package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

class TestURLConnection {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.google.com");
        URLConnection urlConnection = url.openConnection();

        System.out.println("Date: " + urlConnection.getDate());
        System.out.println("Type: " + urlConnection.getContentType());
        System.out.println("Expiration: " + urlConnection.getExpiration());
        System.out.println("Last modify: " + new Date(urlConnection.getLastModified()));
        System.out.println("Length: " + urlConnection.getContentLength());
        System.out.println();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null) {
            System.out.println(inputLine);
        }

        bufferedReader.close();

//        int c;
//        if (urlConnection.getContentLength() > 0) {
//            System.out.println("=== Content ===");
//            try (InputStream input = urlConnection.getInputStream()) {
//                int i = urlConnection.getContentLength();
//                while (((c = input.read()) != -1) && (-i > 0)) {
//                    System.out.println((char) c);
//                }
//            }
//        } else {
//            System.out.println("No Content Available");
//        }

    }

}
