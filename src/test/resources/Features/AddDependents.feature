Feature: Add Dependents

  @dependents
  Scenario: Add Employee Dependents
    Given employee user log in to the system using valid credentials
    When user clicks on My Info
    And clicks on dependents button under employee
    And clicks on add button under assigned dependents
    And clicks on save button
    And displays correct error messages
    And enters dependent's name, relationship, and date of birth
    Then user clicks save button to successfully save dependent


