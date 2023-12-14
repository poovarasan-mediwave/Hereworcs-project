@urgenthelp
Feature: Hereworcsurgent

Scenario: login 
	Given user launch The application 
	When user Enter the valid Email Address in user Field 
	And user Enter the valid Password in password Field 
	And user click the Accept in cookies button 
	Then user click the Login Button And it navigates to Dashboard 
	
Scenario: UrgentHelp 
	Given user click the main menu and shows the submenu
	When user click the UrgentHelp button and It naviagtes to urgenthelp page
	And user Click the Link fot helpline and it Navigates to another window
	Then user Take the screenshot of the page