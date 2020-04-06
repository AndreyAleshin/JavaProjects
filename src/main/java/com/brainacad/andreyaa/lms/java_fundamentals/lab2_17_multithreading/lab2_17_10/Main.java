package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_10;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Main {

    public static void main(String[] args) throws InterruptedException {

        final int NUMBER_THREAT = 100;
        final int NUMBER_READ_WRITE = 500;

        Map<Integer, String> map = new ConcurrentHashMap<>();
//        Map<Integer, String> map = new HashMap<>();

        WriteThread[] writeThreads = new WriteThread[NUMBER_THREAT];
        ReadThread[] readThreads = new ReadThread[NUMBER_THREAT];

        int key = 13;

        for (int i = 0; i < NUMBER_THREAT; i++) {
            writeThreads[i] = new WriteThread(map, NUMBER_READ_WRITE, key);
            readThreads[i] = new ReadThread(map, NUMBER_READ_WRITE, key);
            key += 7;
        }

        for (int i = 0; i < NUMBER_THREAT; i++) {
            writeThreads[i].start();
        }

        for (int i = 0; i < NUMBER_THREAT; i++) {
            readThreads[i].start();
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_THREAT; i++) {
            writeThreads[i].join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time = " + (endTime - startTime + " ms"));

    }

}
