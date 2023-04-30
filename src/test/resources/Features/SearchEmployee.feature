Feature: Search Employee
  @testCaseSearch @smoke
  Scenario Outline: Searching for a Employee by Name
     # Given open the browser and launch HRMS application
      When user enters valid user and valid password
      And click on login button
      When user clicks on PIM
   # And user clicks on employee list button
      And user enters employee name "<fullname>"
      And user clicks on search button
      And check searching results
    #  And close the browser
    Examples:
      |fullname|
      |James Bond|
      |JAMES BOND|
      |James B   |
      |Mkason bond|

  @testCaseSearch1 @smoke
  Scenario: Searching for a Employee by ID
     # Given open the browser and launch HRMS application
    When user enters valid user and valid password
    And click on login button
    When user clicks on PIM
   # And user clicks on employee list button
    And user enters employee id
    And user clicks on search button
    And check searching results
    #  And close the browser