@GoogleLinks
Feature: Test Google Links

  Background: 
    Given Open Google for Testing Links

  @GmailLink
  Scenario: Test Gmail Link
    When Click on Gmail Link
    Then Gmail page should display

  @ImagesLink
  Scenario: Test Images Link
    When Click on Images Link
    Then Images page should display

  @AboutLink
  Scenario: Test About Link
    When Click on About Link
    Then About page should display

  @AdvtLink
  Scenario: Test Advt Link
    When Click on Advt Link
    Then Advt Page should display
