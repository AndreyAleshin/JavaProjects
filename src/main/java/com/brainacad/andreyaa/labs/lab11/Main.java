package com.brainacad.andreyaa.labs.lab11;

public class Main {
    public static void main(String[] args) {

        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumbers("Andrey", "067-123-45-67");
        phoneBook.addPhoneNumbers("Oleg", "067-321-54-76");
        phoneBook.addPhoneNumbers("Veronica", "044-548-88-77");
        phoneBook.addPhoneNumbers("Katya", "097-654-28-63");
        phoneBook.addPhoneNumbers("Nikolay", "050-549-55-15");

        phoneBook.printPhoneBook();
    }
}
