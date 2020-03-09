package com.brainacad.andreyaa.lms.java_fundamentals.lab2_14_generics.lab2_14_1;

public class Main {

    public static void main(String[] args) {

        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("abc", 123, 1000L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(1.005, "asd", "dfg");


        System.out.println(myTuple1.field1);
        System.out.println(myTuple1.field2);
        System.out.println(myTuple1.field3);

        System.out.println(myTuple2.field1);
        System.out.println(myTuple2.field2);
        System.out.println(myTuple2.field3);

    }

}
