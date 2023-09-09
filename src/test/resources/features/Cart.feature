@Cart
Feature: Shopping Cart
  As a user I want to delete my purchases in my cart

  Scenario: List of shopping products in the cart that will be deleted
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User filter list product by "Name (Z to A)"
    And User click item "Test.allTheThings() T-Shirt (Red)"
    And User click item "Sauce Labs Onesie"
    And User click cart button
    And User clicks the Delete button on one cart product item
    And User clicks the Checkout button