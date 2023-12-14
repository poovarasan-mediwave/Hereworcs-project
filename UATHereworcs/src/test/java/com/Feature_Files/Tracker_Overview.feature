Feature: Tracker Overview page

  Scenario: Login
    Given user launch the Browser for tracker_overview
    When user click the Login button for tracker_overview
    And user enter the username in the field for tracker_overview
    And user enter the password in the password field for tracker_overview
    Then user click the login button and page navigates to the home page for tracker_overview

  Scenario: Tracker overview page
    When user click the menu icon 
    And user click the tracker menu and navigates to the tracker overview page
    And In Your Tracker page user select month or year or weeks
    And user click the arrow
    And In Your Tracker page user add tracker
    And user took screenshot of Your Tracker overview
    And user choose month or year or weeks in Trackers overview
    And user click Arrow to change dates
    And user select the trackers
    Then user took screenshot of trackers overview
