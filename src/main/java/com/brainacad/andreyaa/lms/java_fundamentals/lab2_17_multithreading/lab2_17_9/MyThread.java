package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_9;

class MyThread extends Thread {

    private int threadNumber;
    private MyObject obj1;
    private MyObject obj2;
    private MyObject obj3;

    MyThread(int numberThread, MyObject obj1, MyObject obj2, MyObject obj3) {
        this.threadNumber = numberThread;
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    @Override
    public void run() {

        synchronized (obj1) {

            System.out.println("Thread " + threadNumber + ": Holding " + obj1.getName() + "...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ee) {
                ee.printStackTrace();
            }
            System.out.println("Thread " + threadNumber + ": Waiting for " + obj2.getName() + "...");

        }

    }

}
