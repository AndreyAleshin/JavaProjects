package com.brainacad.andreyaa.lms.java_fundamentals.lab2_16_method_overload_resolution.lab2_16_5;

class Main {

    public static void main(String[] args) {

        byte b = 5;

        foo(5);
        foo(b);

    }

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(byte b) {
        System.out.println("byte");
    }

}
