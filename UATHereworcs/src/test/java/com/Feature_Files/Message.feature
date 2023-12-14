@Message 
Feature: HereworcsMessage 

Scenario: Message Login 
	Given user launch the Url 
	When user enter the Email address in text box 
	And user enter the Password in text box 
	And user Click the accept cookies Button 
	Then user click the Login Button and it naviagtes to home page 
	
Scenario: Circle Overview 
	Given user Click the Main menu and Shows the submenu 
	When user Click the Message button and It naviagtes to My circle  Overview 
	And user click the search button and Enter the Name 
	And user click the Clinician name and message the person button 
	And user Enter the subject in Text box 
	And user Enter the Particular message in Create Message Box 
	And user click take Photo and upload button in the page 
	And user Click the Addfile Button 
	And user Click the Send Button and The message send to the Clinician 
	Then user Click the my circle button and Takes screenshot 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
