package com.brainacad.andreyaa.lms.java_fundamentals.lab2_9_string_processing;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // Lab 2-9-1
        System.out.println("------------ Lab 2-9-1 ------------");
        String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(reverseString(myStr) + "\n");


        // Lab 2-9-2
        System.out.println("------------ Lab 2-9-2 ------------");
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        for (int i = 0; i < myStr1.length(); i++) {
            if (myStr2.indexOf(myStr1.charAt(i)) == -1) {
                System.out.print(myStr1.charAt(i) + " ");
            }
        }
        System.out.println();
        System.out.println();


        // Lab 2-9-3
        System.out.println("------------ Lab 2-9-3 ------------");
        System.out.println(uniqueChars("Using methods of class String")); // U m e h d f c l a S r
        System.out.println();


        // Lab 2-9-4
        System.out.println("------------ Lab 2-9-4 ------------");
        String myStr3 = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer stringTokenizer1 = new StringTokenizer(myStr3, " ");
        StringTokenizer stringTokenizer2 = new StringTokenizer(myStr3, ",");
        StringTokenizer stringTokenizer3 = new StringTokenizer(myStr3, ".", false);

        while (stringTokenizer1.hasMoreElements()) {
            System.out.println(stringTokenizer1.nextElement());
        }

//        while (stringTokenizer2.hasMoreElements()) {
//            System.out.println(stringTokenizer2.nextElement());
//        }
//
//        while (stringTokenizer3.hasMoreElements()) {
//            System.out.println(stringTokenizer3.nextElement());
//        }

        System.out.println();


        // Lab 2-9-5
        System.out.println("------------ Lab 2-9-5 ------------");
        String[] strings = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        for (String string : strings) {
            boolean result = checkPersonWithRegExp(string);
            if (result) {
                System.out.println("Name - " + string + " is correct");
            } else {
                System.out.println("Name - " + string + " is not correct");
            }
        }

    }

    // Lab 2-9-2
    private static String reverseString(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }

    // Lab 2-9-3
    private static char[] uniqueChars(String str) {

        char[] uniqueChars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                uniqueChars[i] = str.charAt(i);
            }
        }

        return uniqueChars;

    }

    // Lab 2-9-5
    private static boolean checkPersonWithRegExp(String userNameString) {

        String template;

        // template = "[A-Z]\\w{1}\\w[a-z][^0-9]*";
        template = "[A-Z][a-z][^A-Z]*";

        Pattern pattern = Pattern.compile(template);
        Matcher matcher = pattern.matcher(userNameString);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
        
    }

}
