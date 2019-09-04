package com.github.andreyaleshin.HeadFirstJava;

public class TestExceptions {

    public static void main(String[] args) {

        String test = "no";

        try {
            System.out.println("Start of the TRY");
            doRisky(test);
            System.out.println("End of the TRY");
        } catch (Exception e) {
            System.out.println("Scary exception");
        } finally {
            System.out.println("FINALLY");
        }
        System.out.println("End of the MAIN");
    }

    static void doRisky(String test) throws Exception {
        System.out.println("Start of the dangerous method");
        if ("yes".equals(test)) {
            throw new Exception();
        }
        System.out.println("End of the dangerous method");
    }
}
