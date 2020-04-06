package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_2;

class Main {

    public static void main(String[] args) {

        Thread bomb = new Thread(new MyTimeBombRunnable());

        bomb.start();

    }

}
