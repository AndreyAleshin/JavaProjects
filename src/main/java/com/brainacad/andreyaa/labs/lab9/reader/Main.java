package com.brainacad.andreyaa.labs.lab9.reader;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Journal journal = new Journal();
        Ebook ebook = new Ebook();
        Website website = new Website();

        book.read();
        journal.read();
        ebook.read();
        website.read();

    }
}
