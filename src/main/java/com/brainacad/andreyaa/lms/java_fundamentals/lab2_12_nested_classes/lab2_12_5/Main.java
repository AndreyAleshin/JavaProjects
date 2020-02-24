package com.brainacad.andreyaa.lms.java_fundamentals.lab2_12_nested_classes.lab2_12_5;

public class Main {

    public static void main(String[] args) {

        MyTestClass myTestClass = new MyTestClass();
        myTestClass.test();

        MyTestClass.MyStaticNestedClass myStaticNested = new MyTestClass.MyStaticNestedClass();
        myStaticNested.test();

        MyTestClass.MyInnerClass myInner = myTestClass.new MyInnerClass();
        myInner.test();

    }

}
