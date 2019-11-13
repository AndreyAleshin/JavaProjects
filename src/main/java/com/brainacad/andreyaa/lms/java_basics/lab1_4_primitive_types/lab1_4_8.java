package com.brainacad.andreyaa.lms.java_basics.lab1_4_primitive_types;

public class lab1_4_8 {
    public static void main(String[] args) {

        long bigValue = 111_222L;
        System.out.println(bigValue);
        int i1 = (int) bigValue;
        System.out.println(i1);
        int i2 = (int) 111_222L;
        System.out.println(i2);

        short s = 15;
        System.out.println(s);
        byte b1 = (byte) s;
        System.out.println(b1);
        byte b2 = (byte) 15;
        System.out.println(b2);

        double d = 50;
        System.out.println(d);
        char c = (char) d;
        System.out.println(c);

    }
}
