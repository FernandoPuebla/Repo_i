Feature: Basic Arithmetic
  Background: A Calculator
    Given a calculator I just turned on
  Scenario: Addition

    When I add 4 and 5
    And I press +
    Then the result is 9

    Scenario: Another Addition
      When I add 4 and 7
      And I press +
      Then the result is 11

    Scenario: Substraction
      When I add 7 and 4
      And I press -
      Then the result is 3
