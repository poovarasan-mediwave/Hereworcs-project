@myHealth
Feature: My Health

Scenario: Login
Given user launch The Browser
When user click the accept cookies
And enter username Field
And user Enter password
Then click sigin button and Page Navigates to Home Page

  Scenario: Menu
    When user click the menu icon
    Then user click the My Health and page navigates to my health page

  Scenario: my Health
    When user click the about me
    Then user click view about me button

  Scenario: Personal details
    When user click down arrow
    And user click the Edit button and page navigates to edit page
    And user edit the Gender
    And user edit the Nick Name
    And user save the data
    And user click Ok button in popup
    Then user click personal details and took screenshot

  Scenario: Who is Important to me
    When user click the down arrow button
    And click the edit button in this page and navigate to next page
    And user enter the name
    And user enter the relationship
    And user enter the email
    And user click the save button
    Then user click ok in pop and take screenshot

  Scenario: How to best support me
    When user click the arrow button in this field
    And user click the edit button
    And user enter text in emergency
    And user enter the text in Hobbies
    And user enter the text in exercise
    And user enter text in caring
    And user enter the text in unwell
    And save data
    Then click the popup ok button

  Scenario: My Background
    When click down arrow button in background
    And user click edit and navigates to editing page
    And user enter text in lived in
    And user enter the Nationality
    And user enter the strengts filed
    And user enter text in Achievements
    And user save this data
    Then user click ok and take a screenshot

  Scenario: My Immediate Needs
    When user click arrow in immediate needs
    And user click edit
    And user select checkbox1
    And user select checkbox2
    And user enter How to communicate with me
    And user enter My preferred language is
    And user enter How I feel on a typical day:
    And click save
    Then click ok and took Screenshot
