package com.brainacad.andreyaa.labs.lab7.inheritance.compose;

public class TestA {

    public void test() {
        System.out.println("test in A");
    }

    public void check() {
        System.out.println("check in A");
        test();
    }
}
