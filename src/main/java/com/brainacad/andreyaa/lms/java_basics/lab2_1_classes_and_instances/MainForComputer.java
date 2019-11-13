package com.brainacad.andreyaa.lms.java_basics.lab2_1_classes_and_instances;

public class MainForComputer {
    public static void main(String[] args) {

        // Creating 5 Computer objects adn placing it to array (using loop)
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }

        // Setting manufacturers for all PCs
        computers[0].setManufacturer("Asus");
        computers[1].setManufacturer("CyberPowerPC");
        computers[2].setManufacturer("Origin PC");
        computers[3].setManufacturer("MSI");
        computers[4].setManufacturer("Samsung");

        // Setting serial numbers using enhanced loop
        for (int i = 0; i < computers.length; i++) {
            computers[i].setSerialNumber(i + 100); // just random number
        }

        // Setting a price for each of the PCs
        int price = 500;
        for (int i = 0; i < computers.length; i++) {
            if (i == 0) {
                computers[i].setPrice(price); // price for the 1st PC
            } else {
                computers[i].setPrice((price + price * 0.1f) * i);
                // every iteration
                // price increases by 10% and *i (just for random number)
            }
        }

        // Setting a CPU quantity in stars
        for (int i = 0; i < computers.length; i++) {
            computers[i].setQuantityCPU(i + 1); // +1 just for 1 2 3 4 5, not 0,1,2...
        }

        // Setting a CPU frequency
        for (int i = 0; i < computers.length; i++) {
            computers[i].setFrequencyCPU(i + 1); // same as in previous loop
        }

        // Prints all info of all objects to console
        for (Computer computer : computers) {
            System.out.println();
            computer.view();
        }

        // Same but without foreach loop
//        System.out.println("Here are the specs of PC №1: \n");
//        computers[0].view();
//
//        System.out.println("Here are the specs of PC №2: \n");
//        computers[1].view();
//
//        System.out.println("Here are the specs of PC №3: \n");
//        computers[2].view();
//
//        System.out.println("Here are the specs of PC №4: \n");
//        computers[3].view();
//
//        System.out.println("Here are the specs of PC №5: \n");
//        computers[4].view();

    }
}
