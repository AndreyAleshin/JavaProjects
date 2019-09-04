package com.brainacad.andreyaa.labs.lab7.interfaces.communication;

public interface MailSender {

    String createMail(String mail);

    void sendMail(String mail);
}
