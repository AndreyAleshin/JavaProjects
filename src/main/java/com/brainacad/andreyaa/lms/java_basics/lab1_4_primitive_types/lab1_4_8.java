package com.brainacad.andreyaa.lms.java_basics.lab1_4_primitive_types;

public class lab1_4_8 {
    public static void main(String[] args) {

        long bigValue = 111_222L;
        System.out.println(bigValue);
        int i1 = (int) bigValue;
        System.out.println(i1);
        int i2 = (int) 111_222L;
        System.out.println(i2);

        byte b = 15;
        System.out.println(b);
        short s1 = (short) b;
        System.out.println(s1);
        short s2 = (short) 15;
        System.out.println(s2);

        char c = '2';
        System.out.println(c);
        double d = (double) c;
        System.out.println(d);

    }
}
