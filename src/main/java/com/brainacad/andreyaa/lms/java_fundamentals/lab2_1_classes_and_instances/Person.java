package com.brainacad.andreyaa.lms.java_fundamentals.lab2_1_classes_and_instances;

public class Person {

//    public String name;
//    public int age;
//    public String gender;
//    public int yearOfBirth;
//
//    public Dog dog;

    private String name;
    private int age;
    private String gender;
    private int yearOfBirth;

    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
