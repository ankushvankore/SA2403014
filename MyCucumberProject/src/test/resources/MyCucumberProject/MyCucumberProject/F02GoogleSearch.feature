Feature: Google Search Functionality

  Scenario: To validate google search functionality
    Given Open google app
    When Enter valid keyword in Searchbox
    And I hit enter
    Then Search result should display
