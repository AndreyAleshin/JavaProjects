package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class UserExternalize implements Externalizable {

    private String firstName;
    private String lastName;
    private int age;

    public UserExternalize() {
    }

    public UserExternalize(String firstName, String lastName, int age) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getFirstName());
        out.writeObject(this.getLastName());
        out.writeInt(this.getAge());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        age = in.readInt();
    }

}
