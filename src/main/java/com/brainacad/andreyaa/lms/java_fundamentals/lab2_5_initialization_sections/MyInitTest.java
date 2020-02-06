package com.brainacad.andreyaa.lms.java_fundamentals.lab2_5_initialization_sections;

class MyInitTest {

    private static int b;
    private int a;
    private int c;

    {
        a = 1;
        System.out.println("Non-static initialization block 1");
    }

    {
        a = 2;
        System.out.println("Non-static initialization block 2");
    }

    static {
        b = 3;
        System.out.println("Static initialization block 1");
    }

    static {
        b = 4;
        System.out.println("Static initialization block 2");
    }

    public MyInitTest(int c) {
        this.c = c;
        System.out.println("Constructor 1");
    }

    public MyInitTest() {
        this(1);
        System.out.println("Constructor 2");
    }


}
