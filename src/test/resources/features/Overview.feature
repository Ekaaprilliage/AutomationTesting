@Overview
Feature: Overview Payment Finish
  As a user I have finished making payments

  Scenario: make a payment
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User filter list product by "Name (Z to A)"
    And User click item "Test.allTheThings() T-Shirt (Red)"
    And User click item "Sauce Labs Onesie"
    And User click cart button
    And User clicks the Delete button on one cart product item
    And User clicks the Checkout button
    And User input "eka" as a FirstName "aprillia" as a LastName "1234" as a PostalCode
    And User clicks the Continue button
    And User Verify that Sauce Labs Onesie as a product in the list checkout
    And User Verify the total price of item checkout
    Then User clicks the Finish button