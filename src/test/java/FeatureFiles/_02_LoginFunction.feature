Feature: Login Functionality

  Scenario: User Logins
    Given Navigate to Luma
    When User logins with valid credentials
    Then User should login successfully