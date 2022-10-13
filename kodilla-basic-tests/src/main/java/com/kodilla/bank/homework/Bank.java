package com.kodilla.bank.homework;

// Bank ma zawierać tablicę bankomatów.
// Metody zwracające:
//
// całkowity bilans ze wszystkich bankomatów,
// liczbę transakcji związanych z wypłatą,
// liczbę transakcji związaną z wpłatą pieniędzy,
// średnią wartość wypłaty,
// średnią wartość wpłaty.

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
        this.size = 0;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalNumberOfWithdrawals() {
        int totalNumberOfWithdrawals = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfWithdrawals += cashMachines[i].getNumberOfWithdrawals();
        }
        return totalNumberOfWithdrawals;
    }

    public int getTotalNumberOfDeposits() {
        int totalNumberOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfDeposits += cashMachines[i].getNumberOfDeposits();
        }
        return totalNumberOfDeposits;
    }

    public double getTotalAverageOfDeposits() {
        int depositsCount = getTotalNumberOfDeposits();
        if (depositsCount == 0) {
            return 0;
        }

        double totalSumOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumOfDeposits += cashMachines[i].getSumOfDeposits();
        }
        return totalSumOfDeposits / depositsCount;
    }

    public double getTotalAverageOfWithdrawals() {
        int withdrawalsCount = getTotalNumberOfWithdrawals();
        if (withdrawalsCount == 0) {
            return 0;
        }

        double totalSumInMinus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumInMinus += cashMachines[i].getSumOfWithdrawals();
        }
        return -totalSumInMinus / withdrawalsCount;
    }
}