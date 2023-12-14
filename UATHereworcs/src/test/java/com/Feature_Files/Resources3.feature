@resources3
Feature: HereworcsResources3 

Scenario: loginPage 
	Given user launch The URL 
	When user enter the valid EMAIL address in User field 
	And user Enter The valid PASSWORD in Password field 
	And User click The accept In Cookies Button 
	Then User click the login Button and it navigates To Dashboard 
	
Scenario: Resources3 
	Given user Click the Apps button and Select more Options in the page 
	When user Click the Download button and It navigates to another page and Click Cancel button 
	And user Click forms button and DOB and Click the Check box 
	And user Click Practical concern button and Select the Rate scale 
	And user Click Family concerns button and Select the rate Scale 
	And user Click Emotional Concern Button and select the Rate Scale 
	And user Click Spritual concern button and Select the range scale 
	And user click Physical concern button and Select the Range Scale 
	And user click lifestyle need button and select The range scale 
	And user click the comments button and Save the data form 
	And user Click the Stories button and select the Favourite button 
	Then user Click the Send button and Navigates to message page and Send message to the person 
	
	
	
	
	
	
	
	
	
	
	
	 