package com.brainacad.andreyaa.lms.java_fundamentals.lab2_11_exceptions_and_assertions.lab2_11_1_2;

public class Main {

    public static void main(String[] args) throws MyException{

        // Lab 2-11-1
        System.out.println("------------ Lab 2-11-1 ------------");
        try {
            System.out.println("Inside try block");
            throw new Exception("test for Exception");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("finally block\n");
        }

        // Lab 2-11-2-1
        System.out.println("------------ Lab 2-11-2 ------------");
        try {
            System.out.println("Inside try block");
            throw new MyException("test1 for MyException");
        } catch (MyException e) {
            System.out.println(e.toString());
        }
        System.out.println();

        // Lab 2-11-2-2
        MyTest myTest1 = new MyTest();
        myTest1.test();
        System.out.println();

        // Lab 2-11-2-3
        try {
            MyTest myTest2 = new MyTest();
            myTest2 = null; // NullPointerException
            myTest2.test();
        } catch (MyException | NullPointerException e) {
            System.out.println("MyException and null");
        }

    }

}
