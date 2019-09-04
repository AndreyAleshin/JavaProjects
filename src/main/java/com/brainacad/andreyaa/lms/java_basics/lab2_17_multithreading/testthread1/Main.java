package com.brainacad.andreyaa.lms.java_basics.lab2_17_multithreading.testthread1;

public class Main {
    public static void main(String[] args) {

        // Creating thread using "extends Thread"
        MyTimeBombExtendsThread bomb1 = new MyTimeBombExtendsThread();

        bomb1.start();

        // Creating thread using Runnable
//        Thread bomb2 = new Thread(new MyTimeBombRunnable());
//
//        bomb2.start();

    }
}
