package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_3;

import java.util.Arrays;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        int[] myArray = new int[1000];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(myArray));

        MySumCountThread mySumCount1 = new MySumCountThread();
        MySumCountThread mySumCount2 = new MySumCountThread();

        mySumCount1.setArray(myArray);
        mySumCount2.setArray(myArray);

        // First thread counts sum of the 1st part of myArray and second thread - last part
//        mySumCount1.setStartIndex(0);
//        mySumCount1.setStopIndex(myArray.length / 2 - 1);
//        mySumCount2.setStartIndex(myArray.length / 2);
//        mySumCount2.setStopIndex(myArray.length - 1);
        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(1);
        mySumCount2.setStartIndex(2);
        mySumCount2.setStopIndex(3);

        mySumCount1.start();
        mySumCount2.start();

        try {
            mySumCount1.join();
            mySumCount2.join();
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
