package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_4;

import java.io.Serializable;

class UserSerialize implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    public UserSerialize() {
    }

    public UserSerialize(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SerializeUser {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
