package com.brainacad.andreyaa.lms.java_fundamentals.lab2_5_initialization_sections;

public class Main {

    public static void main(String[] args) {

        // Lab 2-5-1
        MyInitTest myInitTest = new MyInitTest();
        System.out.println();


        // Lab 2-5-2
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();

        myInit1.printArray();
        myInit2.printArray();

        System.out.println();

        // Lab 2-5-3
        /*
        If we will change int[] arr field to static printArray() method
         will print two equal arrays.
        */

        // Lab 2-5-4
        /*
        If we do static {} it will also print two equal arrays.
         */

        // Lab 2-5-5
        InitTest initTest1 = new InitTest();
        InitTest initTest2 = new InitTest();
        InitTest initTest3 = new InitTest();
        InitTest initTest4 = new InitTest();
        InitTest initTest5 = new InitTest();

        System.out.println(initTest1.getId());
        System.out.println(initTest2.getId());
        System.out.println(initTest3.getId());
        System.out.println(initTest4.getId());
        System.out.println(initTest5.getId());

    }

}
