package com.brainacad.andreyaa.lms.java_fundamentals.lab2_15_collections.lab2_15_1;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("number_" + i);
        }

        System.out.println(list);

        for (String element : list)
            System.out.println(element);

    }

}
