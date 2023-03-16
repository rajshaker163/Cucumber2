Feature: verify entered feilds

  @Application
  Scenario: verify entered feilds
    Given open an application
    And enter username and  password
    And press the Submit button to login
    And Entered in to Frames
    And click on add button
    And enter all the data into a given feilds
    And click on save button
    And Exit from frames
    And Logout appication
    Then Close the application
