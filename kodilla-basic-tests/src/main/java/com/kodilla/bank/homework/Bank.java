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
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }
    public CashMachine[] getCashMachines() {
        return cashMachines;
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
    public int getTotalAverageOfDeposits() {
        int totalSumOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumOfDeposits += cashMachines[i].getSumOfDeposits();
        }
        return totalSumOfDeposits / getTotalNumberOfDeposits();
    }

    public int getTotalAverageOfWithdrawals() {
        int totalSumInMinus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumInMinus += cashMachines[i].getSumOfWithdrawals();
        }
        return totalSumInMinus / getTotalNumberOfWithdrawals();
    }
}