package com.brainacad.andreyaa.lms.java_fundamentals.lab2_16_method_overload_resolution.lab2_16_2;

class Main {

    public static void main(String[] args) {

        int i = 15;
        byte b = 127;

        foo(i);
        foo(b);

    }

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(Byte b) {
        System.out.println("Byte");
    }

}
