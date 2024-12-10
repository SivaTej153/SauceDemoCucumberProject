Feature: Login Functionality

  Background:
    Given User is in Login page

  Scenario: Successful Login
    Given user enters valid username and password
    When user clicks on login button
    Then user logs in successfully