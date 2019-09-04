package com.brainacad.andreyaa.labs.lab2;

/**
 * Basic integral type calculator (for simplify using math operators).
 *
 * @author Andrey Aleshin
 */
public class IntegralCalculator {

    /**
     * Sums two values.
     *
     * @param a first addend.
     * @param b second addend.
     * @return sum.
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second value from first.
     *
     * @param a decreasing.
     * @param b subtrahend.
     * @return residual result.
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two values.
     *
     * @param a first multiplier.
     * @param b second multiplier.
     * @return result of multiply.
     */
    public int mul(int a, int b) {
        return a * b;
    }

    /**
     * Divides first value by second.
     *
     * @param a dividend.
     * @param b divider.
     * @return dividing result.
     */
    public int div(int a, int b) {
        return a / b;
    }

    /**
     * Increments a value by one.
     *
     * @param a value.
     *
     * @return increment result.
     */
    public int inc(int a) {
        return ++a;
    }

    /**
     * Decrements a value by one.
     *
     * @param a value.
     *
     * @return decrement result.
     */
    public int dec(int a) {
        return --a;
    }
}
