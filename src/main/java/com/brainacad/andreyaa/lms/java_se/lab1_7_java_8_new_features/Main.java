package com.brainacad.andreyaa.lms.java_se.lab1_7_java_8_new_features;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1 (arrays)
//        int[] arr = new int[10];
//
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return b.compareTo(a);
//            }
//        });
//
//        for (int i = 0; i < arr.length; i++) {
//            int j = (int) (Math.random() * 11);
//            arr[i] = j;
//            System.out.print(arr[i] + " ");
//        }

        // 2 (collections)
        // Without lambda
        List<String> strings = new ArrayList<String>();
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
