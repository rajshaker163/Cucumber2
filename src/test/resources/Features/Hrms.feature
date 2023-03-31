Feature: verify login page

  @verify
  Scenario: verify login page
    Given open url "http://183.82.103.245/nareshit/login.php";
    When enter username and Password
    Then Click on logout
