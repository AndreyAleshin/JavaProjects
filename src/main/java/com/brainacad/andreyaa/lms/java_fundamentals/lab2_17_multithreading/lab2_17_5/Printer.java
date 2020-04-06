package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_5;

class Printer extends Thread {

    private int n;
    private Storage storage;

    public Printer(int n, Storage storage) {
        this.n = n;
        this.storage = storage;
    }

    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            synchronized (storage) {
                while (!storage.isFlag()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(storage.getValue());
                storage.setFlag(false);
                storage.notify();
            }
        }

    }

}
