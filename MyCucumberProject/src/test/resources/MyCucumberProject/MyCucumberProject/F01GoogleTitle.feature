Feature: Google Title Test

  Scenario: To validate Google title
    Given Open google
    When I Read title of the page
    Then Title should be Google
