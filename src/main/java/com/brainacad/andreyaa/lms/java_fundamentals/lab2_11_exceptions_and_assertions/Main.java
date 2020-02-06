package com.brainacad.andreyaa.lms.java_fundamentals.lab2_11_exceptions_and_assertions;

class Main {

    static void testException() {
        try {
            System.out.println("Inside testException()");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {

        System.out.println("Start of main()");
        testException();
        System.out.println("End of main()");

    }

}
