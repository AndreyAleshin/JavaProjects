package com.brainacad.andreyaa.lms.java_basics.lab2_17_multithreading.testthread2;

public class MySumCount extends Thread {

    int startIndex;
    int stopIndex;
    int[] array;
    long resultSum;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {

    }
}
