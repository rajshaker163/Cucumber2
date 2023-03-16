Feature: verify login page

  @verify
  Scenario: verify login page
    Given open url
    When enter username and Password
    Then Click on logout
