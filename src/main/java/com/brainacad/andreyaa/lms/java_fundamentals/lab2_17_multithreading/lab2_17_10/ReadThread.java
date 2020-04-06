package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_10;

import java.util.Map;

class ReadThread extends Thread {

    private Map<Integer, String> map;
    private int numbers;
    private int key;

    ReadThread(Map<Integer, String> map, int numbers, int key) {
        this.map = map;
        this.numbers = numbers;
        this.key = key;
    }

    @Override
    public void run() {

        for (int i = 0; i < numbers; i++) {

            synchronized (map) {
                System.out.println(getName() + " : get -> " + (i + 1) + " (" + map.get(key) + ") ");
                key++;
            }

//            System.out.println(getName() + " : get -> " + (i + 1) + " (" + map.get(key) + ") ");
//            key++;

//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }

    }

}
