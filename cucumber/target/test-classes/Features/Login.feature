#Author
Feature: feature to test login funtionality.

  Scenario Outline: check login succesful with valid credentials
    Given open the browser
    And user is on login page
    When user enters <username> and <password>
    When click on  login button
    Then use gets logout

    Examples: 
      | username | password    |
      | student  | password123 |
      | Student  | Password123 |
