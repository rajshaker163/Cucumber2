Feature: HRMS Application

  Scenario: verfiy login credentials
    Given open an application wih the given url "http://183.82.103.245/nareshit/login.php"
    When enter username and password with valid credentials "nareshit","nareshit"
    When press on login button to login an application
    When Enter into Frames "rightMenu"
    When press the add button
    When Clear the entered code data 
    When Enter the code Firstname Lastname Nickname Middlename "00003","selenium","suresh","mahesh","selenium";
    When choose the file to upload "D:\\New folder\\god.jpg.jpg";
    When press the save button
    When exit into Frames
    When Logout an application
  
