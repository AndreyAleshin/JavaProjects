package com.brainacad.andreyaa.labs.lab2;

/**
 * Base class for outputting results of operations in calculator
 *
 * @author Andrey Aleshin
 */
public class Main {

    public static void main(String[] args) {

        int a = 8;
        int b = 4;

        System.out.println("Here is an example of IntegralCalculator\n");
        IntegralCalculator calculator = new IntegralCalculator();

        System.out.println("\nIntegral calculator with integer sum:");
        int sum = calculator.sum(a, b);
        ResultPrinter.print(a, "+", b, sum);

        System.out.println("\nIntegral calculator with integer subtraction:");
        int sub = calculator.sub(a, b);
        ResultPrinter.print(a, "-", b, sub);

        System.out.println("\nIntegral calculator with integer multiplication:");
        int multiply = calculator.mul(a, b);
        ResultPrinter.print(a, "*", b, multiply);

        System.out.println("\nIntegral calculator with integer division:");
        int div = calculator.div(a, b);
        ResultPrinter.print(a, "/", b, div);

        a = 3;
        System.out.println("\nIncrement:");
        int inc = calculator.inc(a);
        ResultPrinter.printUnary(a, "++", inc);

        a = 3;
        System.out.println("\nDecrement:");
        int dec = calculator.dec(a);
        ResultPrinter.printUnary(a, "--", dec);
        System.out.println("\n");


        double c = 5.1;
        double d = 2.4;

        System.out.println("Here is an example of DoubleCalculator\n");
        DoubleCalculator doubleCalculator = new DoubleCalculator();

        System.out.println("\nTry calc int DoubleSum:");
        double DoubleSum = doubleCalculator.DoubleSum(c, d);
        ResultPrinter.printDouble(c, "+", d, DoubleSum);

        System.out.println("\nTry calc int DoubleSub:");
        double DoubleSub = doubleCalculator.DoubleSub(c, d);
        ResultPrinter.printDouble(c, "-", d, DoubleSub);

        System.out.println("\nTry calc int DoubleMul:");
        double DoubleMul = doubleCalculator.DoubleMul(c, d);
        ResultPrinter.printDouble(c, "*", d, DoubleMul);

        System.out.println("\nTry calc int DoubleDiv:");
        double DoubleDiv = doubleCalculator.DoubleDiv(c, d);
        ResultPrinter.printDouble(c, "/", d, DoubleDiv);
        System.out.println('\n');



        System.out.println("Here is an example of BooleanCalculator\n");
        BooleanCalculator booleanCalculator = new BooleanCalculator();

        a = 32;
        b = 2;
        System.out.println("\nBoolean calculator with  <<:");
        ResultPrinter.printBinary(a,"<<", b, booleanCalculator.shiftLeft(a, b));

        a = 32;
        b = 2;
        System.out.println("\nBoolean calculator with >>:");
        ResultPrinter.printBinary(a,">>", b, booleanCalculator.shiftRight(a, b));

        a = 20;
        b = 2;
        System.out.println("\nBoolean calculator with >>>:");
        ResultPrinter.printBinary(a,">>>", b, booleanCalculator.zeroShift(a, b));

        a = 8;
        b = 8;
        System.out.println("\nBoolean calculator with XOR:");
        ResultPrinter.printBinary(a,"^", b, booleanCalculator.xor(a, b));

        a = 23;
        System.out.println("\nBoolean calculator with NOT:");
        ResultPrinter.printBinary(a,"~", booleanCalculator.not(a));

        a = 4;
        b = 6;
        System.out.println("\nBoolean calculator with AND:");
        ResultPrinter.printBinary(a,"&", b, booleanCalculator.and(a, b));

        a = 4;
        b = 6;
        System.out.println("\nBoolean calculator with OR:");
        ResultPrinter.printBinary(a,"|", b, booleanCalculator.or(a, b));
    }
}
