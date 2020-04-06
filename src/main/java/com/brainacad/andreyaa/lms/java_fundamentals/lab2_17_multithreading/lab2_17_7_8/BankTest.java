package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_7_8;

class BankTest {

    static final int N_ACCOUNTS = 5;
    static final int INIT_BALANCE = 1000;

    public static void main(String[] args) {

        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);

        for (int i = 0; i < N_ACCOUNTS; i++) {
            new Transfer(bank, i, INIT_BALANCE).start();
        }

        /*
        As we can see the total balance of all the accounts corrupted (total balance
        value is not always 5000 -> race condition).
         */

    }

}
