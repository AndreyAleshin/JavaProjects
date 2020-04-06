package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_6;

class DiningHall {

    static int pizzaNum;
    static int studentID = 1;

    public void makePizza() {
        pizzaNum++;
    }

    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else {
            result = "Starved ";
        }
        System.out.println(result + studentID);
        studentID++;
    }

    public static void main(String[] args) {

        DiningHall diningHall = new DiningHall();

        for (int i = 0; i < 10; i++) {
            diningHall.makePizza();
        }

        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(diningHall);
        }
        for (Student student : students) {
            student.start();
        }

//        for (int i = 1; i <= 20; i++) {
//            diningHall.servePizza();
//        }

    }

}


class  Student extends Thread {

    private DiningHall diningHall;

    public Student(DiningHall diningHall) {
        this.diningHall = diningHall;
    }

    @Override
    public void run() {
        synchronized (diningHall) {
            diningHall.servePizza();
        }
    }

}
