Feature: check  home page functionality.

  Background: user is looged in
    Given user is on logging page
    When user enter username password
    And Clicks on login button


  Scenario: check logout link
    When user click on Practise button 
    And Click on the Text Exceptions Link
    
    Scenario: check text box is occur or not
     When user click on the Add button 
     And Send text on text box 
     



    