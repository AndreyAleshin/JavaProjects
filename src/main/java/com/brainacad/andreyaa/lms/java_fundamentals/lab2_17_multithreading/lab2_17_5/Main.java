package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_5;

class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        Thread counter = new Thread(new Counter(1_000, storage));
        Thread printer = new Printer(1_000, storage);

        counter.start();
        printer.start();

    }

}
