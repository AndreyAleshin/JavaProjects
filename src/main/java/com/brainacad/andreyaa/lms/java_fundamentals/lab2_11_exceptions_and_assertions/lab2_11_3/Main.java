package com.brainacad.andreyaa.lms.java_fundamentals.lab2_11_exceptions_and_assertions.lab2_11_3;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Vitaliy");
        person.setLastName("Petrov");

        try {
            person.setAge(125);
        } catch (InvalidAgeException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(person);
    }

}
