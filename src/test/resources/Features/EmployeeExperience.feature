Feature: Employee

  @employeeexperience @smoke

  Scenario: Employee  add work experience
    # Given open the browser and launch HRMS application
    When employee enter valid email and valid password
    And click on login
    And employee clicks on myinfo tab
    And employee clicks on qualification tab
    Then employee clicks on work experience add button
    And employee can enter company title
    And employee can enter job title
    And employee click on from calendar
    And employee click on to calendar
    Then employee write in the comment box
    And click on the save button
    #And Close the browser


  @employeeexperience1 @smoke
  Scenario: Employee  add work experience
    # Given open the browser and launch HRMS application
    When Employee enter valid email and valid password
    And Employee click on login
    And Employee clicks on myinfo tab
    And Employee clicks on qualification tab
    Then Employee clicks on work experience add button
    And Employee can enter company title
    And Employee can enter job title
    And Employee click on from calendar
    And Employee click on to calendar
    Then Employee writes in the comment box
    And Employee click on the save button
    #And Close the browser


