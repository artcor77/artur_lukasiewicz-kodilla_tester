Feature: Fail withdrawal
  Scenario: Fail withdrawal because of not enough money on account
    Given I have deposited $100 in my account
    When I request $200
    Then $0 should be dispensed
    And I should be told "You have not enough money on your account"