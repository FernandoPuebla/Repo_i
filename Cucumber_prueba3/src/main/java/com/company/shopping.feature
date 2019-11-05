Feature:Check my basket application

  Scenario: No item selected i basket
    Given I start the application
    Then I should see a selection of products
    When I browse without buying product
    Then my basket should be empty
    And I cannot buy an item