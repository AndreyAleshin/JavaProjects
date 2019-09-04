package com.brainacad.andreyaa.labs.lab7.Vehicle;

public class VehicleMain {
    public static void main(String[] args) {

        System.out.println("\nTry to equal two Vehicles:");
        Vehicle vehicle1 = new Vehicle("Vehicle", 200);
        Vehicle vehicle2 = new Vehicle("Vehicle", 200);
        System.out.println(vehicle1.equals(vehicle2));

        System.out.println("\nVehicle toString:");
        System.out.println(vehicle1);
    }
}
