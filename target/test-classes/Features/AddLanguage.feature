Feature: Admin Adds Languages to Qualifications

  Background:
    When user enters valid user and valid password
    And click on login button

  Scenario: Add Language to Qualifications
    # Given open the browser and launch HRMS application
    # When user enters valid user and valid password
    # And click on login button
    When Admin navigates to Qualifications and Selects Language
    And Clicks Add
    Then Enters the Language
    And Clicks Save
    Then The Language Will Be Added
    # And close the browser