package com.brainacad.andreyaa.lms.java_basics.lab2_1_classes_and_instances;

public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    void view() {
        System.out.print("The name of a manufacturer: " + getManufacturer() + "\n");
        System.out.print("Serial number: " + getSerialNumber() + "\n");
        System.out.print("Price for one piece: " + getPrice() + "\n");
        System.out.print("CPU quantity is: " + getQuantityCPU() + " star(s)\n");
        System.out.print("CPU frequency: " + getFrequencyCPU() + "\n");
    }

}
