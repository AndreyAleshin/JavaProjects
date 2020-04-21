package com.brainacad.andreyaa.lms.java_se.lab3_7_java_8_new_features.lab3_7_1_2_3;

import java.util.*;

class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 10);
            arr[i] = random;
        }
        System.out.println(Arrays.toString(arr));

//        Arrays.sort()

        // 2 (collections)
        // Without lambda
        List<String> strings = new ArrayList<>();
        strings.add("asdf");

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // With lambda
//        Collections.sort(strings, (o1, o2) -> o1.length() - o2.length());

        for (String s : strings) {
            System.out.println(s);
        }

    }

}
