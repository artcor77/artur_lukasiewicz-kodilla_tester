package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveThreeCashMachines() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(3, cashMachines.length);
    }
    @Test
    public void shouldHaveZeroCashMachines() {
        Bank bank = new Bank( new CashMachine[]{});
        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(0, cashMachines.length);
    }
    @Test
    public void shouldGetTotalBalance() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(500);
        a2.add(1000);
        a3.add(-200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(1300, bank.getTotalBalance());
    }
    @Test
    public void shouldGetTotalNumberOfWithdrawals() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(500);
        a2.add(1000);
        a3.add(-200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(1, bank.getTotalNumberOfWithdrawals());
    }
    @Test
    public void shouldGetZeroNumberOfWithdrawals() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(500);
        a2.add(1000);
        a3.add(200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(0, bank.getTotalNumberOfWithdrawals());
    }
    @Test
    public void shouldGetTotalNumberOfDeposits() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(500);
        a2.add(1000);
        a3.add(-200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(2, bank.getTotalNumberOfDeposits());
    }
    @Test
    public void shouldGetZeroNumberOfDeposits() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(-500);
        a2.add(-1000);
        a3.add(-200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(0, bank.getTotalNumberOfDeposits());
    }
    @Test
    public void shouldGetTotalAverageOfDeposits() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(500);
        a2.add(-1000);
        a3.add(-200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(500, bank.getTotalAverageOfDeposits());
    }
    @Test
    public void shouldGetTotalAverageOfWithdrawals() {
        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(500);
        a2.add(1000);
        a3.add(-200);

        Bank bank = new Bank( new CashMachine[] {a1, a2, a3});
        bank.getCashMachines();
        assertEquals(-200, bank.getTotalAverageOfWithdrawals());
    }
}
