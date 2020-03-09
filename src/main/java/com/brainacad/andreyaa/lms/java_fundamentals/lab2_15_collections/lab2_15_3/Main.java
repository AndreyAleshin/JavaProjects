package com.brainacad.andreyaa.lms.java_fundamentals.lab2_15_collections.lab2_15_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            linkedList.add("num_" + i);
            arrayList.add("num_" + i);
        }

        Iterator<String> iterator1 = linkedList.iterator();
        Iterator<String> iterator2 = arrayList.iterator();

        System.out.print("LinkedList: ");
        while (iterator1.hasNext()) {
            String element = iterator1.next();
            System.out.print(element + " ");
        }
        System.out.println();


        System.out.print("ArrayList: ");
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            System.out.print(element + " ");
        }
        System.out.println();


        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            linkedList.add(listIterator.next());
        }
        // or we can use linkedList.addAll(arrayList);
        System.out.println("LinkedList with inserted ArrayList: " + linkedList);


        for (int i = arrayList.size() - 1; i >= 0; i--) {
            linkedList.add(arrayList.get(i));
        }
        System.out.print("LinkedList with inserted and reversed elements of the ArrayList: ");
        printElements(linkedList);

    }

    private static void printElements(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
