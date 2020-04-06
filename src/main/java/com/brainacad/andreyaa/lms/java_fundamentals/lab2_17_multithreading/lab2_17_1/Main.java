package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_1;

class Main {

    public static void main(String[] args) {

        MyTimeBombThread myTimeBomb = new MyTimeBombThread();

        myTimeBomb.start();

    }

}
