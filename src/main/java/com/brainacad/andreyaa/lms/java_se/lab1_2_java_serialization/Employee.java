package com.brainacad.andreyaa.lms.java_se.lab1_2_java_serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String address;
    private transient int SNN;
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

    public int getSNN() {
        return SNN;
    }

    public void setSNN(int SNN) {
        this.SNN = SNN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", address: '" + address + '\'' +
                ", SNN: " + SNN +
                ", number: " + number +
                '}';
    }
}
