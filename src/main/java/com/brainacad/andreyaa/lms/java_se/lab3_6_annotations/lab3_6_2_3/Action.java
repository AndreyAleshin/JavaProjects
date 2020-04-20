package com.brainacad.andreyaa.lms.java_se.lab3_6_annotations.lab3_6_2_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Action {

    private static String path = "D:\\AAA\\123.txt";

    @MyPermission(value = PermissionAction.USER_WRITE)
    static void writeFile(User user) {

        try (FileWriter writer = new FileWriter(path, true)) {
            String text = "Hello!";
            writer.write(text);
            writer.append("\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @MyPermission(value = PermissionAction.USER_READ)
    static void readFile(User user) {

        try (FileReader reader = new FileReader(path)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    static void reflectionWrite(User user) {

        if (user.getPermissions().contains(PermissionAction.USER_WRITE)) {
            writeFile(user);
            System.out.println("File has been successfully written!");
        } else {
            System.out.println(user.getName() + ", you are not allowed to WRITE to this file!");
        }

    }

    static void reflectionRead(User user) {

        if (user.getPermissions().contains(PermissionAction.USER_READ)) {
            readFile(user);
            System.out.println("File has been read!");
        } else {
            System.out.println(user.getName() + ", you are not allowed to READ this file!");
        }

    }

}
