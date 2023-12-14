@Resource1
Feature: HereworcsResources1 


Scenario: Loginpage 
	Given user launch the URl 
	When user enter the valid email address In user field 
	And user Enter the valid password In Password field 
	And user click the accept In Cookies button 
	Then user Click the login Button And it navigates To dashboard 
	
Scenario: Resources1 
	Given user click the Main Menu and shows the Submenu 
	When user the Resources button and It navigates to resources page 
	And user Click the Covid button and it shows Covid News 
	And user Select the Visit page and Send button for thr Covid page and Repeats the flow 
	And user click the Tips and Self help  and search button and Enter the topic Name 
	And user Click the Visit Page and Send Button for the Tips and self help page and Repeated the Flow 
	And user Click the Prostate Cancer button and Select the Favourite Button in the Page 
	And user Click the visit page and send button in the Prostate cancer page and the flow repeated 
	And user Click the Colorectal cancer button and select the visit button in the page
	And user click the Send button in colo cancer and It naviagtes to message page and repeat the flow
	And user click the Useful Link button and Select the favourite button 
	Then user Click the link and send button in useful link and repeated the flow
	
	
	
	
	
	
	
	
	
	
	
	
	
	
