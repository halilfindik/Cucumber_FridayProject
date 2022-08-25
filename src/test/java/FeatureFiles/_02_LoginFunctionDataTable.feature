Feature: Login Functionality with DataTable

  Scenario: User Logins
    Given Navigate to Luma
    When User logins with valid credentials with DataTable
      | email | horansanlim@gmail.com |
      | pass  | UWmA6ZAaZ9WqjWS       |

    Then User should login successfully