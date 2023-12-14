@BloodPressureTracker
Feature: Enter data in Bloodpressure tracker to track

  @BloodPressureTracker1
  Scenario: Login to Hereworcs Application
    Given User opens the url in browser for blood pressure
    When User need to enter email address in "email" field for blood pressure
    When user need to enter password in "password" field for blood pressure
    #Then user has to clicks to acceptbutton to accept the cookies for blood pressure
    Then user then click Loginbutton to login to application for blood pressure
    And User then navigated to home page for blood pressure
    
    Scenario: Enter blood pressure tracker data
    Given When user Clicks mainmenu in dashboard page for blood pressure
    When User click tracker in Mainmenu for blood pressure
    Then User clicks Blood pressure tracker for blood pressure
    Then User clicks calendar icon for blood pressure
    Then user clicks to select date on calendar for blood pressure
   Then User prints success message for blood pressure