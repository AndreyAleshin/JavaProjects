package com.brainacad.andreyaa.lms.java_fundamentals.lab2_18_core_java_classes.lab2_18_1;

import java.math.BigInteger;

class Factorial {

    static BigInteger factorial(int N) {

        BigInteger factorial = new BigInteger("1"); // or BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;

    }

    public static void main(String[] args) {

        int N = (int) (Math.random() * 50);
        System.out.println(N + "! = " + factorial(N));

    }

}
