package com.brainacad.andreyaa.labs.lab10;

public class MyException extends Exception {

    private String someString;

    public MyException(String string) {
        this.someString = string;
        System.out.println("Exception MyExcClass");
    }

    public void printException() {
        System.err.println("Message for string: " + someString);
    }
}
