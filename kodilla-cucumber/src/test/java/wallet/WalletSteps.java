package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited ${int} in my wallet", (Integer int1) -> {
            Wallet wallet = new Wallet();
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request ${int}", (Integer int1) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("${int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
    }
}
