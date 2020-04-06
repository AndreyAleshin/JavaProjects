package com.brainacad.andreyaa.lms.java_fundamentals.lab2_16_method_overload_resolution.lab2_16_4;

class Main {

    public static void main(String[] args) {

        Puppy animal = new Puppy();

        animal.foo(null);

    }

}


class Animal {

    void foo(Animal animal) {
        System.out.println("Animal");
    }

}

class Dog extends Animal {

    void foo(Dog dog) {
        System.out.println("Dog");
    }

}

class Puppy extends Dog {

    void foo(Puppy puppy) {
        System.out.println("Puppy");
    }

}
