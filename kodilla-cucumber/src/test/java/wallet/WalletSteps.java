package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    public WalletSteps() {

        //===Moduł
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        //===scenario1
        Given("I have deposited $100 in my account", () -> {
            Wallet wallet = new Wallet();
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });
        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });
        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals("You have not enough money on your account", string);
        });

        //===scenario2
        Given("I have no money in my account", () -> {
            wallet.getBalance();
            Assert.assertEquals(0, wallet.getBalance());
        });
        When("I try deposit $0", () -> {
            wallet.deposit(0);
        });
        Then("The balance has not changed", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });
        Then("Message {string}", (String string) -> {
            Assert.assertEquals("Not recognize money. Try again.", string);
        });
        //scenario 3:
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });
        When("I check the balance of my wallet", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.checkBalance(wallet);
        });
        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals("Balance in your wallet is: $100", cashSlot.getMessage());
        });
    }
}
