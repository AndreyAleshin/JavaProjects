package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_1_2_3;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String address;
//    private int SSN;
    private transient int SSN;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name: '" + name + '\'' +
                ", address: '" + address + '\'' +
                ", SNN: " + SSN +
                ", number: " + number +
                '}';
    }

}
