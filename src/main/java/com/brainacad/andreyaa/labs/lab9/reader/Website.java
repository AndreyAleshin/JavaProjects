package com.brainacad.andreyaa.labs.lab9.reader;

import com.brainacad.andreyaa.labs.lab9.reader.api.Reader;

public class Website implements Reader {

    String website;

    @Override
    public void read() {
        System.out.println("Website URL");
    }
}
