package com.brainacad.andreyaa.lms.java_basics.lab2_1_classes_and_instances;

public class MainForBus {
    public static void main(String[] args) {

        Bus bus = new Bus();
        Person person = new Person();

        bus.setSeats(15);
        System.out.println("Amount of seats int the bus: " + bus.getSeats());

        bus.setDriver(person);
        bus.setSeats(15 - 1);
        person.setName("Fedor");
        person.setAge(45);
        person.setGender("M");
        person.setYearOfBirth(1973);

        System.out.println("Name of the bus driver: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Year of birth: " + person.getYearOfBirth());
        System.out.println("Amount of seats remaining in the bus: " + bus.getSeats());

    }
}
