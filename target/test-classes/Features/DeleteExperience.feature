Feature:  Experience work

  Background:
    When employee enter valid email and valid password
    And click on login
    And employee clicks on myinfo tab
    And employee clicks on qualification tab


  @deleteexperience @smoke
  Scenario:  employee delete work experience
    # Given open the browser and launch HRMS application
   # When employee enter valid email and valid password
   # And click on login
   # And employee clicks on myinfo tab
   # And employee clicks on qualification tab
    Then employee clicks on work experience add button
    And employee can enter company title
    And employee can enter job title
    And employee click on from calendar
    And employee click on to calendar
    Then employee write in the comment box
    And click on the save button
    Then  employee clicks on selected company check box
    And employee clicks on delete button
    # And click on the save button
    #  And Close the browser

