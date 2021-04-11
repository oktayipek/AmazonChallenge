@login
Feature: Users should be able to login

  Scenario Outline: Login
    Given the user is on the login page
    When the user enters "<email>" and "<password>" information
    Then the user should be able to login
    Examples:
      | email                  | password   |
      | oktay-ipek@hotmail.com | eagle_4311 |