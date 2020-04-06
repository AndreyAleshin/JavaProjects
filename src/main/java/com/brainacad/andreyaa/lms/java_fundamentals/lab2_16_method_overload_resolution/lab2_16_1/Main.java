package com.brainacad.andreyaa.lms.java_fundamentals.lab2_16_method_overload_resolution.lab2_16_1;

class Main {

    public static void main(String[] args) {

        Animal animal = new Dog();

        foo(animal);
        foo(new Dog());

    }

    static void foo(Animal animal) {
        System.out.println("Animal");
    }

    static void foo(Dog dog) {
        System.out.println("Dog");
    }

}


class Animal {
}

class Dog extends Animal {
}
