package com.brainacad.andreyaa.lms.java_fundamentals.lab2_11_exceptions_and_assertions.lab2_11_1_2;

class MyTest {

    public void test() throws MyException {
        try {
            throw new MyException("test2 for MyException");
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }

}
