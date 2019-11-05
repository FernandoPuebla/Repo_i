Feature: Check ny basket application
  Scenario: No item selected in basket
    Given I start the application
    Then I should see a selection of products
    When I browse without buying product
    Then my basket should be empty
    And i cannot buy an item