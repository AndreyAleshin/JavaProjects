package com.brainacad.andreyaa.lms.java_se.lab3_5_java_reflection.lab3_5_2;

import java.lang.reflect.Field;
import java.util.Arrays;

class Main {

    private static char[] value;

    public static void main(String[] args) {

        String myStr = "abcd";
        value = myStr.toCharArray();

        System.out.println("Old string value: " + Arrays.toString(value));
        updateField(value);
        System.out.println("New string value: " + Arrays.toString(value));
        System.out.println(value);

    }

    static void updateField(char[] value) {

        char[] newValue = {'z', 'x', 'c', 'v'};
        Class c = Main.class;
        try {
            Field field = c.getDeclaredField("value");
            field.setAccessible(true);
            field.set(value, newValue);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
