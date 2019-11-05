Feature:Check ny basket application

  Scenario: No item selected in basket
    Given I start de application
    Then I should see a selection of products
    When I browse without buying product
    Then my basket should be empty
    And I cannot buy an item
