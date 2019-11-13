package com.brainacad.andreyaa.lms.java_basics.lab1_4_primitive_types;

public class lab1_4_4 {
    public static void main(String[] args) {

        int a = 10;
        int b;

        b = ++a;
        System.out.print("Increment in prefix form: ");
        System.out.println(a +" "+ b);
        b = a++;
        System.out.print("Increment in postfix form: ");
        System.out.println(a +" "+ b);

//        b = --a;
//        System.out.print("Decrement in prefix form: ");
//        System.out.println(a +" "+ b);
//        b = a--;
//        System.out.print("Decrement in postfix form: ");
//        System.out.println(a +" "+ b);

    }
}
