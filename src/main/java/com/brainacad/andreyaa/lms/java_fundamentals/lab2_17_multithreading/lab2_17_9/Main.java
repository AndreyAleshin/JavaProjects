package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_9;

class Main {

    public static void main(String[] args) {

        MyObject object1 = new MyObject("Lock_" + 1);
        MyObject object2 = new MyObject("Lock_" + 2);
        MyObject object3 = new MyObject("Lock_" + 3);

        MyThread thread1 = new MyThread(1, object1, object2, object3);
        MyThread thread2 = new MyThread(2, object2, object3, object1);
        MyThread thread3 = new MyThread(3, object3, object1, object2);

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
