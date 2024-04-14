Feature: Login functionality

  Scenario: Login successful with standard_user
    Given I am in the login page of SauceDemo App
    When I enter valid "standard_user" and "secret_sauce"
    Then I should be taken to the Dashboard page

  Scenario: Login successful with visual_user
    Given I am in the login page of SauceDemo App
    When I enter valid "visual_user" and "secret_sauce"
    Then I should be taken to the Dashboard page