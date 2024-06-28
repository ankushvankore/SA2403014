Feature: Orange HRM Login

  Background: 
    Given I Open OHRM

  Scenario: To validate login with valid data
    When Enter valid username as "admin" and valid password as "admin123"
    And Click on login button
    Then Login should successful

  Scenario: To validate login with invalid data
    When Enter invalid username as "rahul" and invalid password as "rahul123"
    And I Click on login button
    Then Error message should display
