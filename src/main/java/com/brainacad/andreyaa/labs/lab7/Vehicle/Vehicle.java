package com.brainacad.andreyaa.labs.lab7.Vehicle;

import java.util.Objects;

public class Vehicle {

    private String vehicleType;
    private int horsePower;

    public Vehicle(String vehicleType, int horsePower) {
        this.vehicleType = vehicleType;
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return horsePower == vehicle.horsePower &&
                Objects.equals(vehicleType, vehicle.vehicleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, horsePower);
    }

    public String toString() {
        return vehicleType + " has " + horsePower + " horse powers.";
    }
}

