package com.brainacad.andreyaa.misc;

import java.util.Arrays;

class Fibonacci {

    public static void main(String[] args) {

//        System.out.println(fibNaive(100));

//        System.out.println(fibEffective(100));

        int n = 100;
        long[] memo = new long[n + 1];

        Arrays.fill(memo, -1);
        System.out.println(fibNaiveEffective(n, memo));
    }

    // Recursive invoke
    // Very slow method (if n = 100, it will take this program to execute about 50k years)
    // It's repeating the same operations over again
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // Times more effective recursive invoke (remembers all computed results)
    private static long fibNaiveEffective(int n, long[] memo) {
        if (memo[n] != -1)
            return memo[n];

        if (n <= 1)
            return n;

        long result = fibNaiveEffective(n - 1, memo) + fibNaiveEffective(n - 2, memo);
        memo[n] = result;

        return result;
    }

    // Most effective algorithm
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

}
