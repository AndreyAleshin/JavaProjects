package com.brainacad.andreyaa.labs.lab13;

import java.util.*;

class MainCollections {

    public static void main(String[] args) {

        System.out.println("LIST\n");

        // LR12 (Collections)
        // 1a
        List<String> list1 = new ArrayList<>();

        // 1b
        String[] stringArr = new String[]{"audi", "bmw", "mercedes", "ferrari", "mitsubishi"};

        System.out.print("Initial string array:                    ");
        System.out.println(Arrays.toString(stringArr));

        System.out.print("Adding all string elements to the list1: ");
        Collections.addAll(list1, stringArr);
        System.out.println(list1);

        // 1c
        System.out.print("\nCreating new list2\n" + "initializing it with list1:              ");
        List<String> list2 = new ArrayList<>(list1); // Or it is similar to the code below

//        for (String s : list1) {
//            list2.add(s);
//        }
        System.out.println(list2 + "\n");

        // 1d
        System.out.print("Creating list3 using Arrays.asList():    ");
        List<String> list3 = Arrays.asList(stringArr);
        //list3.addAll(Arrays.asList(stringArr));
        System.out.println(list3 + "\n");

        // 1e
        System.out.println("Inserting list3 in the middle of list2: ");
        list2.addAll(list2.size() / 2, list3);
        System.out.println(list2);

        // 1f*
        ListIterator<String> itr = list2.listIterator();

        int i = 0;
        while (itr.hasNext()) {
            itr.next();
            if (i % 2 == 1) {
                itr.remove();
            }
            i++;
            // OR
//            itr.next();
//            itr.next();
//            itr.remove();
        }
        System.out.println("\nRemoving every second element in list2 using ListIterator: \n" + list2);
        System.out.println();

        // 2a
        System.out.println("\nHASHSET\n");
        Set<String> set1 = new HashSet<>();

        String string1 = "summer";
        String string2 = "winter";

        // 2b
        System.out.println("Inserting to set1 two strings:");
        set1.add(string1);
        set1.add(string2);
        System.out.println(set1 + "\n");

        // 2c
        System.out.println("Adding to set1 all of list1 and list2 elements:");
        set1.addAll(list1);
        set1.addAll(list2);
        // 2d
        System.out.println(set1 + "\n");

        // 2e
        System.out.println("LINKEDHASHSET\n");
        Set<String> set2 = new LinkedHashSet<>();

        // 2f
        System.out.println("Adding to set2 all of list2 and list3 elements:");
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println(set2 + "\n");


        // 3a
        System.out.println("\nLINKEDHASHMAP\n");
        Map<Integer, String> map1 = new LinkedHashMap<>();

        // 3b
        map1.put(1, "January");
        map1.put(2, "February");
        map1.put(3, "March");
        map1.put(4, "April");
        map1.put(5, "May");
        map1.put(6, "June");
        map1.put(7, "July");
        map1.put(8, "August");
        map1.put(9, "September");
        map1.put(10, "October");
        map1.put(11, "November");
        map1.put(12, "December");

        // 3c
        System.out.println(map1.get(1)); // if get(0) => null
        System.out.println(map1.get(12));

        // 3d
        map1.put(6, "VACATION");
        System.out.println(map1 + "\n");

        // 3e
        System.out.println("HASHMAP\n");
        Map<Integer, String> map2 = new HashMap<>(map1);

        // 3g*
        System.out.println("MAP1");
        printMap(map1);
        System.out.println("\nMAP2");
        printMap(map2);
        System.out.println();

        // 3h*
        Map<String, Set> map3 = new HashMap<>();
        Set<String> contacts = new HashSet<>();
        contacts.add("067-111-22-33");
        contacts.add("andrey@gmail.com");
        contacts.add("skype-andrey");

        map3.put("Andrey", contacts);
        System.out.println("Student contacts: ");
        System.out.println(map3);


    }

    // 3g*
    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entryMap : map.entrySet()) {
            System.out.println(entryMap.getKey() + ". " + entryMap.getValue());
        }
    }

}
