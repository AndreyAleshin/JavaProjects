package com.brainacad.andreyaa.labs.lab7.interfaces.communication;

public class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        System.out.println("Write on paper");
        return "some mail " + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Drop to box");
        System.out.println(mail + " sended!");
    }
}
