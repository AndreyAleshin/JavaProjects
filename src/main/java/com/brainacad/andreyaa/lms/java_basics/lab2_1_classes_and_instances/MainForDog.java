package com.brainacad.andreyaa.lms.java_basics.lab2_1_classes_and_instances;

public class MainForDog {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("Tuzik");
        System.out.println(dog.getName());

        dog.setAge(5);
        System.out.println(dog.getAge());

    }
}
