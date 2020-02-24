package com.brainacad.andreyaa.lms.java_fundamentals.lab2_12_nested_classes.lab2_12_5;

class MyTestClass {

    public void test() {
        class MethodLocalInnerClass {
            public void test() {
                System.out.println("This is local class");
            }
        }
        MethodLocalInnerClass myLocalClass = new MethodLocalInnerClass();
        myLocalClass.test();
    }

    public static class MyStaticNestedClass {
        public void test() {
            System.out.println("This is static nested class");
        }
    }

    public class MyInnerClass {
        public void test() {
            System.out.println("This is inner class");
        }
    }



}
