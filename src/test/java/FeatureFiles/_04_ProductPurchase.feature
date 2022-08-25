Feature: Product Purchase Functionality

  Scenario: User buys a product
    Given Navigate to Luma
    And User logins with valid credentials
    When User adds a product to cart
    And User
    Then Verify the purchase