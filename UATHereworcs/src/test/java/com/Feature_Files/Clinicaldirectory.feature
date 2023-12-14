@cliniciandirectory
Feature: Hereworcsclinicalcaseload
Scenario: Message Login
	Given User launch the Url for clinical directory	
	When User click the accept cookies Button clinical directory
	Then User enter the Email address in text box clinical directory
	Then User enter the Password in text box for clinical directory
	Then User click the Login Button and it naviagtes to home page for clinical directory
	
		
  Scenario: User send message through clinical directory
	Given User click on bentomenu for clinical directory
    When User select on clinical circle for clinical directory
    Then User click on clinical directory section
	Then User select on clinical colleagues searchbox for Enter username
	#Then User click on clinical colleagues searchicon 
	Then User select under clinical collegues
	Then User clicking message this person button for clinical directory
	Then User Enter text on subject for clinical directory 
	Then User Enter message in create message field for clinical directory
	And user click camera icon in the page for clinical directory
	Then click take photo button for clinical directory
	Then click on upload photo button for clinical directory
	And user Click the Addfile Button for clinical directory
	And user Click the Send Button and The message send to the User for clinical directory
	