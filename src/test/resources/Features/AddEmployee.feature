Feature: Employee
  @testCase1
  Scenario: Adding a new Employee
     # Given open the browser and launch HRMS application
    When user enters valid user and valid password
    And click on login button
    When user clicks on PIM
    And user clicks on add employee button
    And user enters firstname and middlename and lastname
    And user selects create login box
    And user fills username
    And user fills password and confirm it
    And user selects status enabled
    And user clicks on save button
    #And close the browser