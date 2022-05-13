Feature: Open LinkedIn in chrome
  Scenario: Test a LinkedIn profile in Chrome browser
    Given Open chrome browser and launch linkedIn
    When I enter correct username and password
    Then the profile should be opened in LinkedIn

