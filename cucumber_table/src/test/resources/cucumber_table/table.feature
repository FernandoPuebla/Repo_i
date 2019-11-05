Feature: LoginFeature
  This feature deals with the login functionality of the application
#Los comentarios inician con gato
  Scenario: Login with correct username and password
    Given I navigate to the login page
  #And I enter the username as "admin" and password as "adminpassword"
    And I enter the following for Login
    #Para enderezar la tabla es ctrl + alt + L
      | UserName | Password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page