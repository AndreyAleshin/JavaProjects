package com.brainacad.andreyaa.labs.lab3;

/**
 * Simple class with static methods (demonstration of work with cycles and conditional operators in Java).
 * Helps to calculate several math sequences.
 *
 * @author Andrey Aleshin
 */
public final class MathSequences {

    /**
     * Sum of several values.
     *
     * @param values values sequence
     * @return sum result.
     */
    public static int sum(int ...values) {
        int result = 0;
        for (int a: values) {
            result += a;
        }
        return result;
    }

    /**
     * Multiply of several values.
     *
     * @param values values sequence
     * @return multiply result.
     */
    public static int mul(int ...values) {
        int result = 1;
        for (int a: values) {
            result *= a;
        }
        return result;
    }

    /**
     * Print all numbers unless {@param interrupt }
     *
     * @param skipValue skipped value
     * @param values  values sequence
     */
    public static void printWithSkip(int skipValue, int ...values) {
        for (int a: values) {
            if (a == skipValue) {
                continue;
            }
            System.out.print(a + " ");
        }
    }

    /**
     * Prints all numbers before reaching a set value {@param interrupt }
     *
     * @param interruptValue force end value
     * @param values  values sequence
     */
    public static void printToValue(int interruptValue, int ...values) {
        for(int a: values) {
            System.out.print(a + " ");
            if (a == interruptValue) {
                break;
            }
        }
    }

    /**
     * Get a count of figure's tops.
     *
     * @param name name of figure
     * @return sum result.
     */
    public static int defineFigureTops(String name) {
        switch (name.toLowerCase()) {
            case "triangle" :
                return 3;
            case "square" :
            case "rectangle" :
            case "parallelogram" :
                return 4;
            case "circle" :
                return 0;
            default:
                System.out.println("Unknown figure!");
                return -1;
        }
    }

    /**
     * Calculates factorial value.
     *
     * @param a factorial value.
     * @return factorial result of {@param a}.
     */
    public static int factorial(int a) {
        int result = 1;
        int c;
        for (c = 1; c <= a; c++) {
            result *= c;
        }
        return result;
    }

    /**
     * Calculates harmonic progression for value with ratio.
     *
     * @param b base value
     * @param q ratio
     * @param count calc count
     * @return harmonic progression result.
     */
    public static int harmonicProgression(int b, int q, int count) {
        int result = b;
        for (b = 2; b <= count; b++) {
            System.out.print(result + " ");
            result *= q;
        }
        return result;
    }

    /**
     * Calculates arithmetic progression for value with ratio.
     *
     * @param a base value
     * @param q ratio
     * @param count calc count
     * @return arithmetic progression result.
     */
    public static int arithmeticProgression(int a, int q, int count) {
        int result = a;
        for (a = 2; a <= count; a++) {
            System.out.print(result + " ");
            result += q;
        }
        return result;
    }

    /**
     * Denies to create instance of this class.
     */
    private MathSequences() { }
}
