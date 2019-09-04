package com.brainacad.andreyaa.labs.lab3;

import static com.brainacad.andreyaa.labs.lab3.MathSequences.*;

/**
 * Simple class to learn cycles and conditional operators
 *
 * @author Andrey Aleshin
 */
public class Lab3Test {

    public static void main(String[] args) {

        // Part 1
        System.out.println("Sum of values: " + sum(3,3,5,10));
        System.out.println("Multiply of values: " +  mul(1,1,5,10));

        // Part 2
        System.out.print("Print with skipping the value: ");
        printWithSkip(1,1,5,10,1,2,1,5,1,8,8);
        System.out.println();
        System.out.print("Print with interrupt: ");
        printToValue(15,1,5,10,1,2,1,15,1,8,8);
        System.out.println("\n");

        // Part 3
        System.out.println("A circle has " + defineFigureTops("cIrcLE") + " tops");
        System.out.println("A square has " + defineFigureTops("SQuAre") + " tops");
        System.out.println("A rectangle has " + defineFigureTops("reCTAngLe") + " tops");
        System.out.println("A parallelogram has " + defineFigureTops("pArALLEloGrAm") + " tops");
        System.out.println("A triangle has " + defineFigureTops("TRIanGle") + " tops");
        System.out.println("A trapeze has " + defineFigureTops("tRaPezE") + " tops\n");

        // Part 4
        System.out.println("Factorial of set value: " + factorial(4));
        System.out.print("Harmonic progression: ");
        System.out.println(harmonicProgression(2, 4, 5));
        System.out.print("Arithmetic progression: ");
        System.out.println(arithmeticProgression(2,4,5));
    }
}
