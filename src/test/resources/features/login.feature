Feature: Login

  @login
  Scenario: I want to access user login page of ndosi website
    Given that i have valid credentials
    And i input the valid email
    And also input a valid password
    When click the login button
    Then I should login successfully to the page

    Examples:
      | email           | password   |
      | admin@gmail.com | @12345678  |