Feature: Login Functionalities


  @Adminlogin @smoke
  Scenario: Valid Admin login

    # THE ABOVE STEP SHOULD BE COMMENTED AS A GIVEN STEP. THIS OPEN AN ADDITIONAL UNEEDED WINDOW!!!!!!!!
    When user enters valid user and valid password
    And click on login button
    Then user is logged in successfully into the application
    # The above step has no code in the method.

