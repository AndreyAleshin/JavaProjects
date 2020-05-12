package com.brainacad.andreyaa.lms.java_se.lab3_9_proxy_classes.lab3_9_1;

class Main {

    public static void main(String[] args) {

        // plain calc object (CalculatorImpl)
        Calculate plainCalculator = new CalculateImpl();
        System.out.println("Call methods without proxy:");
        plainCalculator.multiplication(4, 2);
        plainCalculator.division(4, 2);
        System.out.println();

        // dynamic proxied calc object (CalculateProxy)
        Calculate proxiedCalculator = (Calculate) CalculateProxy.newInstance(plainCalculator);
        System.out.println("Call methods using the proxy:");
        proxiedCalculator.multiplication(4, 2);
        proxiedCalculator.division(4, 2);

    }

}
