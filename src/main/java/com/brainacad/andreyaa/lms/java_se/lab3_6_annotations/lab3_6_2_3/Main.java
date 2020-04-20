package com.brainacad.andreyaa.lms.java_se.lab3_6_annotations.lab3_6_2_3;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        User userWrite = new User("Bob");
        User userRead = new User("John");

        List<PermissionAction> list1 = new ArrayList<>();
        List<PermissionAction> list2 = new ArrayList<>();

        list1.add(PermissionAction.USER_WRITE);
        list2.add(PermissionAction.USER_READ);

        userWrite.setPermissions(list1);
        userRead.setPermissions(list2);

        System.out.println(userWrite.toString());
        System.out.println(userRead.toString());
        System.out.println();

        Action.reflectionWrite(userWrite);
        Action.reflectionRead(userRead);

//        Action.reflectionWrite(userRead);
//        Action.reflectionRead(userWrite);

    }

}
