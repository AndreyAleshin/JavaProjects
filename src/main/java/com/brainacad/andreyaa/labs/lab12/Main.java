package com.brainacad.andreyaa.labs.lab12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        int a = 0;
        for (int i = 0; i < 10; i++) {
            list.add("number_"+a);
            a++;

        }
        System.out.println(list);
    }
}
