package com.brainacad.andreyaa.lms.java_fundamentals.lab2_11_exceptions_and_assertions.lab2_11_3;

class InvalidAgeException extends RuntimeException{

    @Override
    public String toString() {
        return "Invalid age. Please, type age between 1 and 120.";
    }

}
