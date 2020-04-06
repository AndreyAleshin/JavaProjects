package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_4;

import java.util.Arrays;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        int[] myArray = new int[20];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(myArray));

        MySumCountRunnable mySumCount1 = new MySumCountRunnable();
        MySumCountRunnable mySumCount2 = new MySumCountRunnable();

        Thread thread1 = new Thread(mySumCount1);
        Thread thread2 = new Thread(mySumCount2);

        mySumCount1.setArray(myArray);
        mySumCount2.setArray(myArray);

        /*
         First thread counts sum of the 1st part of myArray and second thread - 2nd part.
         In other words - all array.
         */
//        mySumCount1.setStartIndex(0);
//        mySumCount1.setStopIndex(myArray.length / 2 - 1);
//        mySumCount2.setStartIndex(myArray.length / 2);
//        mySumCount2.setStopIndex(myArray.length - 1);

        // The sum of first 4 elements
        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(1);
        mySumCount2.setStartIndex(2);
        mySumCount2.setStopIndex(3);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.print("\nA given array (with startIndex and stopIndex): ");
        System.out.print("[");

        int startIndex1 = mySumCount1.getStartIndex();
        int stopIndex1 = mySumCount1.getStopIndex();

        for (int i = startIndex1; i <= stopIndex1; i++) {
            System.out.print(myArray[i] + ", ");
        }

        int startIndex2 = mySumCount2.getStartIndex();
        int stopIndex2 = mySumCount2.getStopIndex();

        for (int i = startIndex2; i <= stopIndex2; i++) {
            if (i == stopIndex2) {
                System.out.print(myArray[i]);
            } else {
                System.out.print(myArray[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.println("\nThe sum of a given array elements: " + (mySumCount1.getResultSum() +
                mySumCount2.getResultSum()));

    }

}
