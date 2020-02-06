package com.brainacad.andreyaa.lms.java_fundamentals.lab2_5_initialization_sections;

class InitTest {

    private int id;
    private static int nextId;

    static {
        nextId = (int) (Math.random() * 1000);
    }

    {
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }

}
