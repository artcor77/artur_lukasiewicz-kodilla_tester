package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLenght() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldGetNumberOfTransaction() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(500);
        cashMachine.add(1000);
        cashMachine.add(-200);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(4, transactions.length);
    }

    @Test
    public void shouldGetBalance() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(500);
        cashMachine.add(1000);
        cashMachine.add(-200);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(1200, cashMachine.getBalance());
    }

    @Test
    public void shouldGetNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(-100);
        cashMachine.add(200);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(1, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldGetNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(500);
        cashMachine.add(1000);
        cashMachine.add(-200);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldGetSumOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(500);
        cashMachine.add(1000);
        cashMachine.add(-200);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(-300, cashMachine.getSumOfWithdrawals());
    }

    @Test
    public void shouldGetSumOfDeposits() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(500);
        cashMachine.add(1000);
        cashMachine.add(-200);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(1500, cashMachine.getSumOfDeposits());
    }
}
