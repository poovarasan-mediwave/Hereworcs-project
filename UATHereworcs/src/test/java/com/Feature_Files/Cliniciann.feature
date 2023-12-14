@clinician
Feature: Clinicianlogin

Scenario: clinician login 
	Given User launch the uRl 
	When User enter the email Address in text Box 
	And user Enter The password in Text Box 
	And user click the accept Cookies button 
	Then User click the login Button and it naviagtes to home page 
	
	Scenario: Healthinfo
	When user click the main menu button and submenu shows up
	Then user click the questionnaire button and it navigates to questionnaire page
	And user click the submit image button and it Navigates to health info page
	
	
	
	


