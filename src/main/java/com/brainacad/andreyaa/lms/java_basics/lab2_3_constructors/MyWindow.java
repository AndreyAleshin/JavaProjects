package com.brainacad.andreyaa.lms.java_basics.lab2_3_constructors;

public class MyWindow {

    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;


    public MyWindow(double width) {
        this.width = width;
    }

    public MyWindow(float height) {
        this.height = height;
    }

    public MyWindow(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(String color) {
        this.color = color;
    }

    public MyWindow(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    // Lab Work 2-3-1
    public void printFields() {
        System.out.println(getWidth());
        System.out.println(getHeight());
        System.out.println(getNumberOfGlass());
        System.out.println(getColor());
        System.out.println(isOpen());
    }

    // Lab Work 2-3-2
//    public MyWindow() {
//        this.width = width;
//        this.height = height;
//        this.numberOfGlass = numberOfGlass;
//        this.color = color;
//        this.isOpen = isOpen;
//    }

    // Lab Work 2-3-3 and 2-3-4
    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width, height, numberOfGlass);
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass, color);
        this.isOpen = isOpen;
    }
}

class Test {
    public static void main(String[] args) {

        // Lab Work 2-3-1
//        MyWindow myWindow1 = new MyWindow(1.5);
//        MyWindow myWindow2 = new MyWindow(2f);
//        MyWindow myWindow3 = new MyWindow(3);
//        MyWindow myWindow4 = new MyWindow("white");
//        MyWindow myWindow5 = new MyWindow(true);
//
//        myWindow1.printFields();
//        System.out.println();
//        myWindow2.printFields();
//        System.out.println();
//        myWindow3.printFields();
//        System.out.println();
//        myWindow4.printFields();
//        System.out.println();
//        myWindow5.printFields();


        // Lab Work 2-3-2
//        MyWindow myWindow = new MyWindow();
//        System.out.println(myWindow.getWidth());
//        System.out.println(myWindow.getHeight());
//        System.out.println(myWindow.getNumberOfGlass());
//        System.out.println(myWindow.getColor());
//        System.out.println(myWindow.isOpen());


        // Lab Work 2-3-3 and 2-3-4
//        MyWindow myWindow = new MyWindow(3.5, 4f, 4, "red", true);
//        myWindow.printFields();

        // Lab Work 2-3-5
//        for (MyWindow myWindow: MyWindow[]){
//            myWindow = new MyWindow(2.5);
//            System.out.println();
//        }
    }
}
