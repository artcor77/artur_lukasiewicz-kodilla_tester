package homework;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class IsItFizzBuzzSteps implements En {

    private int number;
    private String answer;

    public void IsDivisibleBySteps() {
        Given("the number is 0", () -> {
            this.number = 0;
        });

        Given("the number is 1", () -> {
            this.number = 1;
        });

        Given("the number is three", () -> {
            this.number = 3;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 15", () -> {
            this.number = 15;
        });

        Given("the number is 9", () -> {
            this.number = 9;
        });

        Given("the number is 10", () -> {
            this.number = 10;
        });

        When("I ask whether it's Fizz or Buzz", () -> {
            NumberChecker divisibleChecker = new NumberChecker();
            this.answer = divisibleChecker.checkIfDivisibleByThreeAndFive(this.number);
        });

        Then("I should be told <answer>", (String string) -> {
            Assertions.assertEquals(string, this.answer);
        });
    }
}
