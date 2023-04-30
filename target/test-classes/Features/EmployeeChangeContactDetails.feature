Feature: Employee Change Contact Details

  @EmpChangeDetails
  Scenario: Update Personal Information
    When the user is logged in with valid credentials
    And user enters valid username and valid password
    And the user clicks on login
    And the user clicks on My Info
    And the user clicks on edit
    And user update firstname, middlename, and lastname
    And user clicks on male button
    And user clicks on Marital Status dropdown
    #Then users select Marital Status
    And user clicks on nationality dropdown
    #Then users select nationality country
    Then the changes should be saved successfully