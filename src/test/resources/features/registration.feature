Feature: UserRegistration

  Background:
    Given I am on the login page

  @registration
  Scenario Outline: Register a new user
    When I click on "Sign Up Here" link
    And I enter firstName "<firstName>"
    And I enter lastName "<lastName>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirmPassword>"
    And I select group "<groupName>"
    And I click on register button
    Then I should see successful registration message

    Examples:
      | firstName | lastName | email                  | password | confirmPassword | groupName   |
      | Hurri     | cane2    | hurri.cane2@gmail.com  | @1234578 | @1234578        | Admin Group |