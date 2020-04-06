package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_7_8;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Transfer extends Thread {

    private Bank bank;
    private int from;
    private int max;
    private Lock lock = new ReentrantLock();

    Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int sum = random.nextInt(max) + 1;
            int to = (int) (Math.random() * bank.getNumOfAccounts());

            // For lab2-17-7
//            bank.transfer(from, to, sum);

            // For lab2-17-8
            synchronized (bank) {
                bank.transfer(from, to, sum);
            }

//            lock.lock();
//            try {
//                bank.transfer(from, to, sum);
//            } finally {
//                lock.unlock();
//            }



        }

    }

}
