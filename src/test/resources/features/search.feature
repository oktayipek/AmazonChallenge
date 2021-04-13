Feature: Users should be able to search

  Scenario Outline: Search
    Given the user is on the home page
    When the user should be able to enter "<searchText>"
    Then the user should see "<expectedResult>"
    Examples:
      | searchText | expectedResult                 |
      | java       | 1-48 of over 4,000 results for |

  @wip
  Scenario Outline: Search with price
    Given the user is on the home page
    When the user should be able to enter "<searchText>" and search
    And the user should be able to choose "<min>" and "<max>" price
    Then the user should see <min> price and <max> price
    Examples:
      | searchText         | min | max |
      | macbook pro laptop | 500 | 600 |