package com.brainacad.andreyaa.labs.lab7;

import com.brainacad.andreyaa.labs.lab7.inheritance.animals.Animal;
import com.brainacad.andreyaa.labs.lab7.inheritance.animals.Cat;
import com.brainacad.andreyaa.labs.lab7.inheritance.animals.Dog;
import com.brainacad.andreyaa.labs.lab7.inheritance.compose.TestA;
import com.brainacad.andreyaa.labs.lab7.inheritance.compose.TestB;
import com.brainacad.andreyaa.labs.lab7.inheritance.devices.Pad;
import com.brainacad.andreyaa.labs.lab7.inheritance.devices.SmartPhone;
import com.brainacad.andreyaa.labs.lab7.polymorphism.Simple;
import com.brainacad.andreyaa.labs.lab7.polymorphism.Specific;

public class Lab7Test {

    public static void main(String[] args) {
        System.out.println("Animal jump:");
        // TODO check it
        Animal animal = new Cat();
        // TODO try to uncomment
        // Cat forceCat = new Animal(); // ERROR Incompatible types.
        // ((Dog)animal).jump(); // ERROR ClassCastException
        Dog dog = new Dog();
        animal.jump();
        dog.jump();


        System.out.println("\nOnly Dog jump:");
        Animal [] animals = {new Cat(), new Dog()};
        for (Animal a: animals) {
            if(a instanceof Dog) { // TODO try to other types
                a.jump();
                a.voice();
            }
        }


        System.out.println("\nTry equals two iPads:");
        Pad p1 = new Pad("iPad", 20_000);
        Pad p2 = new Pad("iPad", 20_000);
        System.out.println(p1.equals(p2));

        System.out.println("\nTry Pad toString:");
        System.out.println(p1);


        System.out.println("\nTry own equals and toString:");
        // TODO this is not work! Create equals and hashCode in SmartPhone class
        // TODO create toString
        SmartPhone s1 = new SmartPhone("Galaxy S8", 10_000);
        SmartPhone s2 = new SmartPhone("Galaxy S8", 10_000);
        System.out.println(s1.equals(s2));



        System.out.println("\nTry call super from child class method:");
        // TODO learn to use 'super' in 'is-a'
        TestA a = new TestB();
        a.check();


        System.out.println("\nTry some CAST:");
        // TODO try cast
        Specific specific = new Specific();
        Simple simple = specific;
        System.out.println(specific.data + " " + simple.data); // no cast
        System.out.println(((Simple)specific).data + " " + ((Specific)simple).data); // cast both
        System.out.println(specific.getData() + " " + simple.getData()); // no cast
        System.out.println(((Simple)specific).getData() + " " + simple.getData());// cast but use dynamic linking
    }
}
