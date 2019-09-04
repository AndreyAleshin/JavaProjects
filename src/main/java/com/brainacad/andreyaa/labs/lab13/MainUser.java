package com.brainacad.andreyaa.labs.lab13;

import java.util.HashSet;
import java.util.Set;

public class MainUser {
    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();

        User user1 = new User("Ivan", 20, "067-999-88-77");
        User user2 = new User("Ivan", 20, "067-999-88-77");
        User user3 = new User("Ivan", 25, "067-999-88-77");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
