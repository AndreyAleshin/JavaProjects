package com.brainacad.andreyaa.lms.java_fundamentals.lab2_15_collections.lab2_15_4_5;

import java.util.*;

class MyNumGenerator {

    private int numOfElements;
    private int maxNumber;

    MyNumGenerator(int numOfElements, int maxNumber) {
        this.numOfElements = numOfElements;
        this.maxNumber = maxNumber;
    }

    // Lab 2-15-4
    List<Integer> generate() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numOfElements; i++) {
            int randomNumber = (int) (Math.random() * maxNumber);
            list.add(i, randomNumber);
        }

        return list;
    }

    // Lab 2-15-5
    Set<Integer> generateDistinct() {

        if (maxNumber < numOfElements) {
            System.out.println("Invalid parameters!");
            return null;
        }

        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < numOfElements; i++) {
            while (set.size() != numOfElements) {
                int randomNumber = random.nextInt(maxNumber);
                set.add(randomNumber);
            }
        }
        return set;

    }

}


class Main {

    public static void main(String[] args) {

        // Lab 2-15-4
        System.out.println("------------ Lab 2-15-4 ------------");
        MyNumGenerator generator1 = new MyNumGenerator(5, 10);
        List<Integer> list = generator1.generate();
        System.out.println(list);
        System.out.println();


        // Lab 2-15-5
        System.out.println("------------ Lab 2-15-5 ------------");
        MyNumGenerator generator2 = new MyNumGenerator(5, 3);
        Set<Integer> set = generator2.generateDistinct();
        System.out.println(set);

    }

}
