@GoalsSmoke
Feature: Enter data in Exercise tracker to track records

  @Logintoapplication
  Scenario: Login to Hereworcs Appln
    Given User has to open the website in the chrome browser 
    When User inputs the email address in "email" field
    When user inputs and enters the valid password in "password" field
    Then user then accepts cookies
    Then user then clicks the login button
    And User then has to navigate to home page of dashboard
    
    
    
    Scenario: To add goal data for daily
    Given When Patient user has clicked the mainmenu in dashboard page
    Then user click the tracker in main menu
    Then User clicks Goals menu
  	#Then User clicks Add a new Goal button
 	#Then user enters input for "what is your goal" field
 	#Then user selects date for  date to start field
 	#Then user selects date for date to achieve field
 	#Then user enter input for goal description "goal description" field
 	#Then user enters input for step field  "steps" data field
 	#Then user selects slider for repeat step during this span
 	#Then user selects the option under timespan to repeat
 	#And User finally clicks Save goal button
 	
 	#Scenario: To add goal data for Weekly
 	#Given When clicks Add new goal button for weekly
 	#Then user enter input1 for "what is your goal" field
 	#Then user select date2 for date to start field
 	#Then user selects date2 for date to achieve field
 	#Then user need to enter input2 for "goal description" field
 	#Then user need to enter input2 for step field "Steps" data field
 	#Then user selects slider again for selecting weekly for repeat step during this span
 	#Then user selects timespan option to repeat
 	#And User has to click save goal button finally 
 	
 	
 	#Scenario: To add goal data for Monthly
 	#Given When clicks Add new goal button for Monthly
 	#Then user enter input3 for "what is your goal" field
 	#Then user select date3 for date to start field
 	#Then user selects date3 for date to achieve field
 	#Then user need to enter input3 for "goal description" field
 	#Then user need to enter input3 for step field "Steps" data field
 	#Then user selects slider again for selecting monthly for repeat step during this span
 	#Then user selects timespan option to repeat monthly
 	#And User has to click save goal button finally for monthly datasss
 	
 	
 	#Scenario: To add another goal step
 	#Given When clicks on date to view the added goal
 	#Then User clicks edit button to add another step
 	#Then User clicks add another step button
 	#Then User enters goalstep under need to achieve field
 	#Then user clicks update button
 	
 	Scenario: To Complete Goal tracker
 	Given when user clicks on date to view the already added goal
 	Then user has to click the view button
 	Then User has to click complete button
 	
 	
 	Scenario: To delete Goal
 	#Given When user need to click date to select
 	#Then user click delete button
 	#Then user has to click yes to confirm deleteion