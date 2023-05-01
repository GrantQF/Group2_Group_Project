Feature: Invalid Login
  @invalidlogin
  Scenario: Invalid Login Test
    When user enters invalid user "<username>" and invalid password "<password>"
    And click on login button
    Then Invalid credentials error message appears
    Examples:
    |username|password|
    |abc123|abc123    |
    |mjtorn|abc123    |
    |abc123|mjtorn    |
    |admin |abc123    |
