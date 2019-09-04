package com.brainacad.andreyaa.labs.lab8;

public class TestStrings1 {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        StringBuilder sb = new StringBuilder("abracadabra");

        System.out.println(myStr.indexOf("ra", 0));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(sb.reverse());
    }
}
