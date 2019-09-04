package com.brainacad.andreyaa.labs.lab2;

/**
 * Basic boolean calculator (for simplify using boolean logic operators).
 *
 * @author Andrey Aleshin
 */
public class BooleanCalculator {

    /**
     * Expression of signed right shift.
     *
     * @param value shifted value.
     * @param shift shift point.
     *
     * @return shifted value result.
     */
    public int shiftRight(int value, int shift) {
        return value >> shift;
    }

    /**
     * Expression of signed left shift.
     *
     * @param value shifted value.
     * @param shift shift point.
     *
     * @return shifted value result.
     */
    public int shiftLeft(int value, int shift) {
        return value << shift;
    }

    /**
     * Expression of right shift with zeros filling.
     *
     * @param value shifted value.
     * @param shift shift point.
     *
     * @return shifted value result.
     */
    public int zeroShift(int value, int shift) {
        return value >>> shift;
    }

    /**
     * Expression of bitwise exclusive OR.
     *
     * @param value1 first operand.
     * @param value2 second operand.
     *
     * @return "XOR" value result.
     */
    public int xor(int value1, int value2) {
        return value1 ^ value2;
    }

    /**
     * Expression of unary bitwise negation.
     *
     * @param value unary operand.
     *
     * @return "NOT" value result.
     */
    public int not(int value) {
        return ~ value;
    }

    /**
     * Expression of bitwise AND.
     *
     * @param value1 first operand.
     * @param value2 second operand.
     *
     * @return "AND" value result.
     */
    public int and(int value1, int value2) {
        return value1 & value2;
    }

    /**
     * Expression of bitwise OR.
     *
     * @param value1 first operand.
     * @param value2 second operand.
     *
     * @return "OR" value result.
     */
    public int or(int value1, int value2) {
        return value1 | value2;
    }
}
