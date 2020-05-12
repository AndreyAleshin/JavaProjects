package com.brainacad.andreyaa.lms.java_se.lab3_9_proxy_classes.lab3_9_2;

class Main {

    public static void main(String[] args) {

        // without proxy
        CalculateBitwise plainBitwiseCalculator = new CalculateBitwiseImpl();
        System.out.println("Call methods without proxy:");
        plainBitwiseCalculator.bitwiseAND(4, 2);
        plainBitwiseCalculator.bitwiseOR(4, 2);
        System.out.println();

//        // with proxy
//        CalculateBitwise proxiedBitwiseCalculator = (CalculateBitwise) CalculateProxy.newInstance();

    }

}
