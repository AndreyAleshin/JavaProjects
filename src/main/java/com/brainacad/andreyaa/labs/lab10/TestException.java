package com.brainacad.andreyaa.labs.lab10;

public class TestException {

    static void procedure() throws Exception {
        System.out.println("Text inside procedure");
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            procedure();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally text");
        }
    }
}
