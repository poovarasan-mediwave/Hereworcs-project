@ExerciseTracker
Feature: Enter data in Exercise tracker to track records

  @ExerciseTracker1
  Scenario: Login to Hereworcs Application
    Given User opens the url in Exercise 
    When User inputs email address in "email" field for Exercise
    When user inputs password in "password" field for Exercise
    Then user accepts cookies for Exercise
    Then user clciks login button for Exercise
    And User then navigated to patients dashboard page for Exercise
    
    Scenario: Enter Exercise tracker data
    Given When user clicked mainmenu in dashboard page for Exercise
    When User clicked tracker in Mainmenu for Exercise
    Then User clicks Swipe arrow for Exercise
    Then User clicks Exercise Tracker  for Exercise
 	Then user clicks Add Exercise Information button for Exercise
 	Then user user clicks date on Exercise calendar icon for Exercise
 	