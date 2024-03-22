Feature: feature demo tags

  @smoke
  Scenario: login functionality
    Given a user is on the login page
    When the user enters valid credentials
    And the user clicks the login button
    Then the user should be logged in successfully

  @regression
  Scenario: logout functionality
    Given a user is on the login page
    When the user enters valid credentials
    And the user clicks the login button
    Then the user should be logged in successfully

  @importance
  Scenario: logout functionality
    Given a user is on the login page
    When the user enters valid credentials
    And the user clicks the login button
    Then the user should be logged in successfully
