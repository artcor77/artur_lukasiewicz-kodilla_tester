Feature: Is it Fizz or Buzz?
  Scenario Outline: The number is or isn't divisible by three and five
    Given the number is <number>
    When I ask whether it's Fizz or Buzz
    Then I should be told <answer>
    Examples:
      | number | answer |
      | zero | "FizzBuzz" |
      | one | "None" |
      | three | "Fizz" |
      | five | "Buzz" |
      | fifteen | "FizzBuzz" |
      | nine | "Fizz" |
      | ten | "Buzz" |