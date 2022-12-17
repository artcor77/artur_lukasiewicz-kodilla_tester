Feature: Is it Fizz or Buzz?
  Scenario Outline: The number is or isn't divisible by three and five
    Given the number is <number>
    When I ask whether it's Fizz or Buzz
    Then I should be told <answer>
    Examples:
      | number | answer |
      | 0 | "None" |
      | 1 | "None" |
      | three | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |