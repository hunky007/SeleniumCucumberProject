Feature: User login.

  Scenario: The user should be able to login successfully.
    Given user click on "Sign In" link
    When user enter valid login and password
    Then user should be able to login successfully


  Scenario: The user should not be able to login.
    Given User click on "Sign In" link
    When user enter invalid login and password
    Then user should get an error message