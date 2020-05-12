package com.brainacad.andreyaa.lms.java_se.lab3_9_proxy_classes.lab3_9_2;

class CalculateBitwiseImpl implements CalculateBitwise {

    @Override
    public int bitwiseAND(int a, int b) {
        return a & b;
    }

    @Override
    public int bitwiseOR(int a, int b) {
        return a | b;
    }

}
