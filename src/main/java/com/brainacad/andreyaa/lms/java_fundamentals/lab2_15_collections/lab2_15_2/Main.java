package com.brainacad.andreyaa.lms.java_fundamentals.lab2_15_collections.lab2_15_2;

import java.util.LinkedList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * (list.size() + 1));
            list.add(index, "number_" + i);
        }

        for (String element : list)
            System.out.println(element);

    }

}
