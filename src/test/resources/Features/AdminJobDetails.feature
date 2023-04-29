Feature: Admin Job Access

  Background:
    When user enters valid user and valid password
    And click on login button

  @EmpEdit
  Scenario: Admin Can Select The Job Title Of The Employee
    # Given open the browser and launch HRMS application
    # When user enters valid user and valid password
    # And click on login button
    When user clicks on PIM
    And Clicks on the Employee They Wish to Edit
    And Clicks on Job on the Left Employee Panel
    Then Clicks Edit
    Then Selects an Employee Job Title
    And Selects an Employee Employment Status
    And Selects a Job Category
    And Selects a Joined Date
    And Selects a Sub Unit
    And Selects a Location
    And Selects a Start Date
    And Selects a End Date
    And Uploads Contract Details up to 1MB
    Then The System Will Store the Job Details Entered
    # Then Close the Browser

  @SaveEmpEdit
  Scenario: System Will Not Save Employee Info if Mandatory Fields Are Blank
    # Given open the browser and launch HRMS application
    # When user enters valid user and valid password
    # And click on login button
    When user clicks on PIM
    And Clicks on the Employee They Wish to Edit
    And Clicks on Job on the Left Employee Panel
    Then Clicks Edit
    Then Selects an Employee Job Title
    And Selects an Employee Employment Status
    And Selects a Joined Date
    And Selects a Sub Unit
    And Selects a Location
    Then The System Validates the Mandatory Fields Are Filled in
    And The System will not Store the Info if All Fields Are Not Filled in
    # Then Close the Browser


