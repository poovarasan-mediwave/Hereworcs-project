@Signup
Feature: Signup

  Scenario Outline: User Signup with credentials
    Given user Launch the browser
    When user enter "<firstname>" first name
    And User enter "<lastname>" last name
    And user enter "<Email>" Email
    And user enter "<Password>" Password
    And user ReEnter "<pass>"  password
    And user click the checkbox
    Then user click the signup button

    Examples: 
      | firstname | lastname |
      | Madhan    | Makes    |
