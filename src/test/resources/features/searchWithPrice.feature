@search
Feature: Users should be able to search

  Scenario Outline: Search with price
    Given the user is on the home page
    When the user should be able to enter "<searchText>"
    Then the user should see "<expectedResult>"
    Examples:
      | searchText | expectedResult                 |
      | mac pro       | 1-48 of over 4,000 results for |