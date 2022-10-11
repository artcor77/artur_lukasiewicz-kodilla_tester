package com.kodilla.bank.homework;

// Tablica ze zrealizowanymi transakcjami (liczbowa wartość dodatnia, jeśli użytkownik wpłacił pieniądze
// i ujemna, jeśli użytkownik wypłacił pieniądze).

// Metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] addTab = new int[this.size];
        System.arraycopy(transactions, 0, addTab, 0, transactions.length);
        addTab[this.size - 1] = transaction;
        this.transactions = addTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int saldoMinus() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
            }
        }
        return sum;
    }

    public int saldoPlus() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += transactions[i];
            }
        }
        return sum;
    }
    public int getSumOfWithdrawals() {
        int sumOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) {
                sumOfWithdrawals += transactions[i];
            }
        } return sumOfWithdrawals;
    }

    public int getSumOfDeposits(){
        int sumOfDeposits = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0) {
                sumOfDeposits += transactions[i];
            }
        } return sumOfDeposits;
    }
    public int getNumberOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                numberOfDeposits++;
        }
        return numberOfDeposits;
    }

    public int getNumberOfWithdrawals() {
        int numbersOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                numbersOfWithdrawals++;
        }
        return numbersOfWithdrawals;
    }
}