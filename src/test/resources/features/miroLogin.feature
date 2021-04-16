@miroLogin
Feature: Users should be able to login

  Scenario Outline: Login
    Given the user is on the Miro login page
    When the Miro user enters "<work_email>" and "<password>" information
    Then the user should be on "<page_title>" page
    Examples:
      | work_email             | password   | page_title                                 |
      | game_dante@hotmail.com | eagle_4311 | Online Whiteboard for Visual Collaboration |