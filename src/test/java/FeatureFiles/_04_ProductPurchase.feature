Feature: Product Purchase Functionality

  Scenario: User buys a product
    Given Navigate to Luma
    And User logins with valid credentials
    When User adds a product to cart
    Then User should successfully add product to cart
    And User buys the product
    Then Verify the purchase