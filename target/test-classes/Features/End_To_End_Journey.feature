Feature: Automation Practice Application User Story

  Scenario: 1. User end to end journey
    Given User opened browser
    And User navigates to the application url
    And User clicks on Sign in link at the top right corner of the application
    When User enters the valid email id and password to click on sign in button
    And User click on T-SHIRTS category to select Faded Short Sleeve T-shirts product
    And Fetching the Amount of the product as per user is selected
    And User is increase the Quantity to 2
    And User is increase the size to L
    And User click on Add to Cart
    Then User should display a message as product added to cart and selected product should display in cart
