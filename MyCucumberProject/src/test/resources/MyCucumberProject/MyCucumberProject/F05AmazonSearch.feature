Feature: Amazon Search

  Scenario: Test search for a product
    Given Open Amazon
    When I search for "Iphone" with price 50000
    Then I should get product "IPhone" with price 50000
