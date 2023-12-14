@Resources
Feature: HereworcsResources

Scenario: login 
	Given user launch The url 
	When user enter the valid email address in user field 
	And user Enter the valid password in Password field 
	And user click the accept in Cookies button 
	Then user Click the login Button And it navigates to dashboard
	
	Scenario: Resources 
	Given user click the Main Menu and shows the Submenu
	When user the Resources button and It navigates to resources page
	And user click the Fliter option and Select the Particular Topics 
	And user click the sort button and select the radio button
	And user Click the set preferences button and it navigates to set preference page
	And user click the save and resource button and It Navigates to Resources Page
	And user Click the Search button and Enter the topics name
	And user Click the Visit page button and it naviagtes to another window 
	Then user click the Favourite button and Close the Pop up 
	
	Scenario: Messages
	Given user click the saved resources and It navigates to Saved Resources page
	When user click the resources page and it Navigates to Resources Page 
	And user click the Patient name and it shows the message this person field
	And user click the send message button and it pop ups success message
	And user Click the videos button and It shows videos in the page
	And user click the send Button for particular video and It navigates to message page and repeat the Flow
	And user Click the Event button and it Shows events in the Page
	And user click the favourite and readinfo and Send button for the event and it navigates to Message Page and Repeated the flow
	And user Click the Support button and Search the particular name
	And user click the visit and send button and It Navigates to message page and repeat The flow
	
	








