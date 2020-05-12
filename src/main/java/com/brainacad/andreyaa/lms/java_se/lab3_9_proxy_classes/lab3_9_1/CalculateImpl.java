package com.brainacad.andreyaa.lms.java_se.lab3_9_proxy_classes.lab3_9_1;

class CalculateImpl implements Calculate {

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

}
