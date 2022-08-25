Feature: Create Account Functionality with DataTable

  Scenario: Signup with a new user
    Given Navigate to Luma
    When Signup a new user with DataTable
      | usernameInput    | Horasanli               |
      | lastnameInput    | Hasanim                 |
      | emailInput       | horansanlim2@gmail.com  |
      | passwordInput    | UWmA6ZAaZ9WqjWS         |
      | passConfirmInput | UWmA6ZAaZ9WqjWS         |

    Then User should signup successfully