@miroLogin
Feature: Users should be able to login

  Scenario Outline: Login
    Given the user is on the login page
    When the user enters "<email>" and "<password>" information
    Then the user should be on Miro service page
    Examples:
      | email            | password |
      | miro@hotmail.com | 1234     |