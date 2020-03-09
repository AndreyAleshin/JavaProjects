package com.brainacad.andreyaa.lms.java_fundamentals.lab2_12_nested_classes.lab2_12_1_2;

public class Main {

    public static void main(String[] args) {

        // Lab 2-12-1
        System.out.println("------------ Lab 2-12-1 ------------");
        MyPhoneBook phoneBook1 = new MyPhoneBook();

        phoneBook1.addPhoneNumber("Sasha", "0501234567");
        phoneBook1.addPhoneNumber("Vova", "0679876543");

        phoneBook1.printPhoneBook();
        System.out.println();


        // Lab 2-12-2
        System.out.println("------------ Lab 2-12-2 ------------");
        MyPhoneBook phoneBook2 = new MyPhoneBook();
        phoneBook2.addPhoneNumber("Oleg", "0673215476");
        phoneBook2.addPhoneNumber("Andrey", "0671234567");
        phoneBook2.addPhoneNumber("Veronica", "0445488877");
        phoneBook2.addPhoneNumber("Katya", "0976542863");
        phoneBook2.addPhoneNumber("Nikolay", "0505495515");

        System.out.println("Sorting by NAME");
        phoneBook2.sortByName();
        phoneBook2.printPhoneBook();
        System.out.println();

        System.out.println("Sorting by PHONE NUMBER");
        phoneBook2.sortByPhoneNumber();
        phoneBook2.printPhoneBook();

    }

}
