@Mood 
Feature: Hereworcsmood 

Scenario: login 
	Given user launch The Application 
	When user enter the valid Email address in user Field 
	And user Enter the valid Password in Password Field 
	And user Click the accept in cookies button 
	Then user Click the Login Button And it navigates to Dashboard 
	
Scenario: tracker 
	Given user Click the main menu and shows the Submenu 
	When user Click the Tracker button and it naviagtes to Tracker Overview 
	And user Click the Tracker menu in tracker overview and show the tracker Dashboard 
	Then user Click the Inactive Tracker and shows the inactive trackers 
	
Scenario: Mood 
	Given user Click the Toggle button and Active the mood Tracker 
	When user Click the Active button and It navigates to Active Page 
	And user Click the Active Mood button and It Navigates to Mood page 
	Then user Click the Add My Mood Information Button and It navigates to New Entry Page 
	
Scenario: New Mood 
	Given user click the Calender and it shows Title of the Calender 
	When user Click the Title and It shows years 
	And user Click the years 
	And user select the Particular Year and It navigates to Months 
	And user select the Month and it navigates to Date 
	And user add the entry for Whole month and Select the Moods and Ratings and Notes and Record and It navigates to new entry page 
	
Scenario: Mood Graph 
	Given user click the month button and the graph for month Occured 
	When user Click the Left Arrow for particular month 
	And user click the edit button and it shows new entry page 
	And user click the update button and it navigates to saved record page 
	And user click the Delete button and Continue Button shows up
	Then Click the continue button and success message Popup
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
