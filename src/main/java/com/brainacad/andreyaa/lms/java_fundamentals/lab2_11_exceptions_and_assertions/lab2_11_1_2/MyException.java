package com.brainacad.andreyaa.lms.java_fundamentals.lab2_11_exceptions_and_assertions.lab2_11_1_2;

class MyException extends Exception {

    private String str;

    public MyException(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "str='" + str + '\'' +
                '}';
    }

}
