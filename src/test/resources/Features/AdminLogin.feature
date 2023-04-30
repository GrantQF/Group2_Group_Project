Feature: Login Functionalities


  @smoke1
  Scenario: Valid Admin login
    Given open the browser and launch HRMS application
    When user enters valid user and valid password
    And click on login button
    Then user is logged in successfully into the application
    And Close the browser

