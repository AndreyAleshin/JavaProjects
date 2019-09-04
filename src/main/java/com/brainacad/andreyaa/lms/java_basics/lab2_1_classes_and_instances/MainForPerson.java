package com.brainacad.andreyaa.lms.java_basics.lab2_1_classes_and_instances;

public class MainForPerson {
    public static void main(String[] args) {

//        Person person = new Person();
//
//        person.setName("Vasya");
//        person.setAge(12);
//        person.setGender("M");
//        person.setYearOfBirth(1981);
//
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
//        System.out.println("Gender: " + person.getGender());
//        System.out.println("Year of birth: " + person.getYearOfBirth());


        Dog dog = new Dog();
        Person person = new Person();

        person.setDog(dog);
        System.out.println(person.getDog());
        dog.setName("Tuzik");
        dog.setAge(5);

        person.setName("Vasya");
        person.setAge(12);
        person.setGender("M");
        person.setYearOfBirth(1981);


        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Year of birth: " + person.getYearOfBirth());

    }
}
