package com.brainacad.andreyaa.labs.lab9.reader;

import com.brainacad.andreyaa.labs.lab9.reader.api.Reader;

public class Journal implements Reader {

    String journal;

    @Override
    public void read() {
        System.out.println("Journal name");
    }
}
