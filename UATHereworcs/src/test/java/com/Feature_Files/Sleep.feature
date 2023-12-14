@Sleep 
Feature: Hereworcs 

Scenario: login 
	Given user Launch The Application 
	When user Enter the valid Email address in user Field 
	And user Enter the Valid Password in Password Field 
	And user Click the Accept in Cookies button 
	Then user Click the Login Button And It navigates to Dashboard 
	
Scenario: Tracker 
	Given user Click the main menu and Shows the Submenu 
	When user Click the Tracker button and It naviagtes to Tracker Overview 
	And user Click the Tracker menu in tracker overview and show the Tracker Dashboard 
	And user Click the Inactive Tracker and shows the Inactive trackers 
	And user Click the sleep Inactive tracker to Active Tracker and sleep tracker moves to active tracker 
	And user Click the Active tracker and shows the sleep tracker 
	Then user Click the Sleep tracker and It navigates to  Sleep tracker page 
	
Scenario: Sleep 
	Given user Click the add My mood information button and It navigates to New Entry Page 
	When user Click the Calender and it shows title of the Calender 
	And user Click the title and it shows years 
	And user Click the Years 
	And user Select the particular Year and it navigates to months 
	And user Select the month and It navigates to Date 
	Then user the Entry for Whole Month and select the durations and wakes and rate of sleep and record and it navigates to New Entry page 
	
Scenario: Sleep Graph 
	Given user Click the Month Button and the graph for Month Occured 
	When user Click the left Arrow for Particular Month 
	And user Click the Edit Button and it shows New Entry page 
	And user Click the Update Button and it Navigates to saved record page 
	And user Click the delete button and continue button shows up 
	Then click the Continue Button and success message Popup 
	
	
	
	
	
