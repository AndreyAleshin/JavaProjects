package com.brainacad.andreyaa.lms.java_basics.lab2_2_methods;

public class Person {

    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public void test(String firstName) {
        System.out.println("String firstName");
    }

    public void test(String firstName, String lastName) {
        System.out.println("String firstName, String lastName");
    }

    public void test(String firstName, int age) {
        System.out.println("String firstName, age");
    }

    public void test(int age, String gender) {
        System.out.println("int age, String gender");
    }

    public void test(int phoneNumber, int age) {
        System.out.println("int phoneNumber, int age");
    }
}

class Test {
    public static void main(String[] args) {

        Person person = new Person();

        person.test("Bob");
        person.test("Bill", "Johnson");
        person.test("Tom", 30);
        person.test(25, "female");
        person.test(111 - 22 - 33, 35);
    }
}
