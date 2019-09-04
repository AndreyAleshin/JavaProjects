package com.brainacad.andreyaa.labs.lab2;

/**
 * Basic floating type calculator
 *
 * @author Andrey Aleshin
 */
public class DoubleCalculator {

    /**
     * Sums two values.
     *
     * @param c first addend.
     * @param d second addend.
     * @return sum.
     */
    public double DoubleSum(double c, double d) {
        return c + d;
    }

    /**
     * Subtracts second value from first.
     *
     * @param c decreasing.
     * @param d subtrahend.
     * @return residual result.
     */
    public double DoubleSub(double c, double d) {
        return c - d;
    }

    /**
     * Multiplies two values.
     *
     * @param c first multiplier.
     * @param d second multiplier.
     * @return result of a multiply.
     */
    public double DoubleMul(double c, double d) {
        return c * d;
    }

    /**
     * Divides first value by second.
     *
     * @param c dividend.
     * @param d divider.
     * @return dividing result.
     */
    public double DoubleDiv(double c, double d) {
        return c / d;
    }
}
