package homework;

import io.cucumber.java8.En;
import static org.junit.Assert.assertEquals;

public class IsItFizzBuzzSteps implements En {

    private int number;
    private String answer;


    public IsItFizzBuzzSteps() {
        Given("the number is zero", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 0;
        });

        Given("the number is one", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 1;
        });

        Given("the number is three", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 3;
        });

        Given("the number is five", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 5;
        });

        Given("the number is fifteen", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 15;
        });

        Given("the number is nine", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 9;
        });

        Given("the number is ten", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 10;
        });

        When("I ask whether it's Fizz or Buzz", () -> {
            // Write code here that turns the phrase above into concrete actions
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisibleByThreeAndFive(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            assertEquals(string, this.answer);
        });
    }
}
