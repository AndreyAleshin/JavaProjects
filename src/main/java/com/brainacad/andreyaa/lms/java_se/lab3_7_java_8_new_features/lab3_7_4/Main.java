package com.brainacad.andreyaa.lms.java_se.lab3_7_java_8_new_features.lab3_7_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {

        Stream<Integer> infiniteIntegers = Stream.iterate(10, i -> i + 10);
        List<Integer> integers = infiniteIntegers
                .limit(10)
                .map(i -> i / 2)
                .collect(Collectors.toList());
        System.out.println(integers);

        List<String> list = Arrays.asList("abcd", "hhsdi", "iewrna", "abbfnb", "poernjsd", "aahfg");
        List<String> newList = list
                .stream()
                .filter(str -> str.startsWith("a"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newList + "\n");


        System.out.println("List of persons: ");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 18, "Male"));
        persons.add(new Person("Ann", 25, "Female"));
        persons.add(new Person("Jane", 16, "Female"));
        persons.add(new Person("Bob", 24, "Male"));
        persons.add(new Person("Jack", 30, "Male"));
        persons.add(new Person("Kate", 27, "Female"));

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nMilitary men: ");
        persons
                .stream()
                .filter(person -> (person.getAge() >= 18) &&
                        (person.getAge() <= 27) &&
                        person.getGender().equals("Male"))
                .forEach(System.out::println);

        System.out.println("\nAverage female's age: ");
        OptionalDouble averageFemaleAge = persons
                .stream()
                .filter(person -> person.getGender().equals("Female"))
                .mapToInt(Person::getAge).average();
        if (averageFemaleAge.isPresent()) {
            System.out.println(averageFemaleAge.getAsDouble());
        }
        else {
            System.out.println("-1");
        }

    }

}
