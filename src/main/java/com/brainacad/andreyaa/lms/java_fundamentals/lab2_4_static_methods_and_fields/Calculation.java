package com.brainacad.andreyaa.lms.java_fundamentals.lab2_4_static_methods_and_fields;

public class Calculation {

    public static void main(String[] args) {

        // Lab 2-4-1, 2-4-2
        int[] array1 = {36, 12, 9, 74, 2, 99, 17, 42, 58, 25};
        int[] array2 = {65, 11, 1, 76, 5, 89, 19, 48, 95, 31};

        int min = MyMath.findMin(array1);
        System.out.println(min);
        int max = MyMath.findMax(array2);
        System.out.println(max);
        System.out.println();


        // Lab 2-4-3
        double areaOfCircle = MyMath.areaOfCircle(4);
        System.out.println(areaOfCircle);
        System.out.println();


        // Lab 2-4-4
        var employee1 = new Employee("Bob", "Brandenberg", "123",
                "123-456");
        var employee2 = new Employee("Joe", "Tanto", "678",
                "897-456");
        System.out.println(Employee.getNumberOfEmployees());
        System.out.println();


        // Lab 2-4-5
        double pi = MyCalc.calcPi(1000000);
        System.out.println(pi);
        System.out.println();


        // Lab 2-4-6
        MyPyramid.printPyramid(5);
        System.out.println();

        // Lab 2-4-7
        GravityCalculator.calcDist(10);


    }

}
