@Resources2 
Feature: HereworcsResources2 

Scenario: loginpage 
	Given user launch the URL 
	When user enter the valid email address in User field 
	And user Enter The valid password in Password field 
	And user click The accept in Cookies button 
	Then user Click the login Button And it navigates To Dashboard 
	
Scenario: Resources2 
	Given user Click the End of life support button and search button 
	When user Enter the name in search button and click favourite 
	And user Click the send button and it Navigates to message page and repeated the Flow 
	And user Click the Health A to Z button and shows the page 
	And user Click the Search button and Enter the valid name and it shows up 
	And user Click the Bereavement button and select favourite in the page 
	And user Click the Send button and It navigates to Message page and Repeats the flow 
	And user Click the Social prescribing button and Shows in Page 
	Then user Click the Links in social page and it naviagates to another window 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
