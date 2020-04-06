package com.brainacad.andreyaa.lms.java_fundamentals.lab2_17_multithreading.lab2_17_7_8;

class Bank {

    private int accounts[];
    private int numOfAccounts;

    Bank(int num_accounts, int initial_balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initial_balance;
        } // we can use Arrays.fill(accounts, initial_balance);
    }

    // can use synchronized keyword
    void transfer(int from, int to, int amount) {

        try {

            System.out.println("From: " + from + ", to: " + to + ", amount: " + amount);

            if (from == to || accounts[from] < amount) return;
            accounts[from] = accounts[from] - amount;

            Thread.sleep((int) (1000 * Math.random()));

            accounts[to] = accounts[to] + amount;

            System.out.println("Total balance: " + totalBalance());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    int totalBalance() {
        int total = 0;
        for (int value : accounts) {
            total += value;
        }
        return total;
    }

    int getNumOfAccounts() {
        return numOfAccounts;
    }

}
