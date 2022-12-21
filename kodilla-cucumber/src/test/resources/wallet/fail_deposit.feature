Feature: Fail deposit
  Scenario: Fail deposit because no money at cashslot
    Given I have no money in my account
    When I try deposit $0
    Then Message "Not recognize money. Try again."
    And The balance has not changed