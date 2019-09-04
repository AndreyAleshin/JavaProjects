package com.brainacad.andreyaa.labs.lab9.service;

import com.brainacad.andreyaa.labs.lab9.api.MessageSender;

/**
 * Some forum for some discussion
 */
public class Forum implements MessageSender {

    String theme;
    String author;

    @Override
    public void sendMessage(String message) {

    }
}
