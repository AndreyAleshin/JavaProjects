package com.brainacad.andreyaa.labs.lab9.reader;

import com.brainacad.andreyaa.labs.lab9.reader.api.Reader;

public class Book implements Reader {

    String book;

    @Override
    public void read() {
        System.out.println("Book name");
    }
}
