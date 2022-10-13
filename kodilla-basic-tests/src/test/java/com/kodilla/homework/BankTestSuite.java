package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldWorkWhenBankHasNoCashMachine() {
        //given
        Bank bank = new Bank(new CashMachine[0]);

        //when then
        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalNumberOfDeposits());
        assertEquals(0, bank.getTotalNumberOfWithdrawals());
        assertEquals(0, bank.getTotalAverageOfDeposits());
        assertEquals(0, bank.getTotalAverageOfWithdrawals());
    }

    @Test
    public void shouldWorkWhenBankHasOneEmptyCashMachine() {
        //given
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(200);
        a1.add(-100);
        a2.add(500);
        a2.add(-100);

        Bank bank = new Bank(new CashMachine[] {a1, a2, a3});

        //when then
        assertEquals(500, bank.getTotalBalance());
        assertEquals(2, bank.getTotalNumberOfDeposits());
        assertEquals(2, bank.getTotalNumberOfWithdrawals());
        assertEquals(350, bank.getTotalAverageOfDeposits());
        assertEquals(100, bank.getTotalAverageOfWithdrawals());
    }

    @Test
    public void shouldWorkWhenBankHasOneCashMachineWithOneTransaction() {
        //given
        CashMachine a1 = new CashMachine();

        a1.add(1000);

        Bank bank = new Bank(new CashMachine[] {a1});

        //when then
        assertEquals(1000, bank.getTotalBalance());
        assertEquals(1, bank.getTotalNumberOfDeposits());
        assertEquals(0, bank.getTotalNumberOfWithdrawals());
        assertEquals(1000, bank.getTotalAverageOfDeposits());
        assertEquals(0, bank.getTotalAverageOfWithdrawals());
    }

    @Test
    public void shouldWorkWhenBankHasNoTransactions() {
        //given
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        Bank bank = new Bank(new CashMachine[] {a1, a2, a3});

        //when then
        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalNumberOfDeposits());
        assertEquals(0, bank.getTotalNumberOfWithdrawals());
        assertEquals(0, bank.getTotalAverageOfDeposits());
        assertEquals(0, bank.getTotalAverageOfWithdrawals());
    }
}
