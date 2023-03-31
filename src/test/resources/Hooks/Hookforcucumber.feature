@Application
Feature: verify login details

  Scenario: veriy page title 
    Given an url
    And enter username and password
    When click on login button
    Then navigate to login home page
    
    
  Scenario: verify login details
    Given an url
    And enter username and password
    When click on login button
    Then navigate to login home page
