Feature: Add Dependents

  @dependents @smoke
  Scenario: Add Employee Dependents
    Given admin user log in to the system using valid credentials
    When user clicks on PIM
    And selects on employee from list
    And clicks on dependents button under employee
    And clicks on add button under assigned dependents
    And clicks on save button
    And displays correct error messages
    And enters dependent's name, relationship, and date of birth
    Then user clicks save button to successfully save dependent


