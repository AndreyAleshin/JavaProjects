package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_1;

class MyTimeBombThread extends Thread {

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOOM!!!");

    }

}
