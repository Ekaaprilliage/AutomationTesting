@Purchase
Feature: Sales
  As a user i want purchase one item from list product

  Scenario: User filter product list
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User filter list product by "Name (Z to A)"
    And User click item "Test.allTheThings() T-Shirt (Red)"
    And User click item "Sauce Labs Onesie"
    And User click cart button