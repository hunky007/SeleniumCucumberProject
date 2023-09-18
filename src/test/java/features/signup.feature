Feature: Create Account

  Background:
    Given I am on Home page
    #Write step in background when the step is common for all scenarios in a feature file.

  Scenario: Sign up successfully
    Given I have entered valid firstname lastname email password and confirmpassword
    When I click on create account button
    Then Account should get created

