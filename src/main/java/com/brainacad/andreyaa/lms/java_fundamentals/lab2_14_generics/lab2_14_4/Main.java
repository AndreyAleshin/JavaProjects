package com.brainacad.andreyaa.lms.java_fundamentals.lab2_14_generics.lab2_14_4;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] array2 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        MyMixer myMixer1 = new MyMixer<>(array1);
        MyMixer myMixer2 = new MyMixer<>(array2);

        myMixer1.shuffle();
        myMixer2.shuffle();

        System.out.println(myMixer1);
        System.out.println(myMixer2);

    }

}

class MyMixer<T> {

    private T[] array;

    MyMixer(T[] array) {
        this.array = array;
    }

    // Fisher–Yates shuffle
    void shuffle() {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1); // i + 1 == array.length
            T temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public String toString() {
        return "Shuffled array: " + Arrays.toString(array);
    }

}