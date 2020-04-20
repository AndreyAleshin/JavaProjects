package com.brainacad.andreyaa.lms.java_se.lab3_5_java_reflection.lab3_5_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Class c = myClass.getClass();
        System.out.println("Class name: " + c.getName() + "\n");

        System.out.println("Modifiers: ");
        int modifiers = c.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            System.out.println("\tpublic");
        }
        if (Modifier.isAbstract(modifiers)) {
            System.out.println("\tabstract");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println("\tfinal");
        } else {
            System.out.println("\tNo modifiers");
        }
        System.out.println();

        System.out.println("Public fields: ");
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + field.getType());
        }
        System.out.println();

        System.out.println("All fields: ");
        fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + field.getType());
        }
        System.out.println();

        System.out.println("Constructors: ");
        Constructor[] constructors = c.getDeclaredConstructors();
        int i = 0;
        for (Constructor constructor : constructors) {
            System.out.print("Constructor " + (i++) + " : ");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Methods: ");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("\tName: " + method.getName());
            System.out.println("\t\tReturn type: " + method.getReturnType());
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print("\t\tParameter type: " + paramType.getName());
            }
            System.out.println();
        }

    }

}


final class MyClass {

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
