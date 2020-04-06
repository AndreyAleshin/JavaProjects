package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_3;

class MySumCountThread extends Thread {

    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;

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

        if (startIndex >= stopIndex) {
            return;
        }

        for (int i = startIndex; i <= stopIndex; i++) {
            resultSum += array[i];
        }

    }

}
