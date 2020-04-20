package com.brainacad.andreyaa.lms.java_se.lab3_5_java_reflection.lab3_5_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) {

        Class<?> c = MyClass.class;
        System.out.println("Class name: " + c.getName());

        try {

            Class<?>[] paramTypes = new Class[]{int.class};

            Constructor<?> constructor = c.getDeclaredConstructor();
            MyClass myClass = (MyClass) constructor.newInstance();

            System.out.println("\nInitial values of a, b, c, d fields: ");
            printFields(myClass);
            System.out.println();

            Method method1 = c.getMethod("setA", paramTypes);
            Method method2 = c.getMethod("setB", paramTypes);
            Method method3 = c.getMethod("setC", paramTypes);
            Method method4 = c.getMethod("setD", paramTypes);

            Object[] arguments = new Object[]{33};
            method1.invoke(myClass, arguments);
            method2.invoke(myClass, 9);
            method3.invoke(myClass, 1);
            method4.invoke(myClass, 12);

            printFields(c, myClass);
            printFields(myClass);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void printFields(MyClass myClass) {
        System.out.println("a = " + myClass.getA());
        System.out.println("b = " + myClass.getB());
        System.out.println("c = " + myClass.getC());
        System.out.println("d = " + myClass.getD());
    }

    static void printFields(Class<?> c, MyClass myClass) {

        System.out.println("All fields: \n");
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {

            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + field.getType());

            try {
                field.setAccessible(true);
                System.out.println("\t\tValue: " + field.getInt(myClass) + "\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

    }

}


class MyClass {

    public int a;
    private int b;
    protected int c;
    private int d;

    MyClass() {
    }

    MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    MyClass(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

}
