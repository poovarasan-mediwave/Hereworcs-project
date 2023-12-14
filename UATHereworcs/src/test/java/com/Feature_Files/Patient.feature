@Patient 
Feature: Patient 


Scenario: patient login 
	Given user Launch the url 
	When user enter the email address in text Box 
	And user enter The password in text Box 
	And user click the accept cookies button 
	Then user click the login Button and it naviagtes to Home Page 
	
	
Scenario: Questionnaires 
	Given user click the Main menu button and Submenu shows up 
	When user click the My health button and It navigates to my Health Overview Page 
	And user click the Questionnaire button in my health page and it Navigates to Dashboard 
	And user click questionnaire menu and select the start button 
	And user select the answers in Questionnaire page 
	And user click privacy policies and Done button and Sucess message Popups 
	Then user Click the Logout button and It navigates to Login page 