package com.brainacad.andreyaa.labs.lab9.reader;

import com.brainacad.andreyaa.labs.lab9.reader.api.Reader;

public class Ebook implements Reader {

    String ebook;

    @Override
    public void read() {
        System.out.println("Ebook model name");
    }
}
