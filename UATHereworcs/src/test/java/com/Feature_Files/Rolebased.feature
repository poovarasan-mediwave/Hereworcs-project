@Rolebased 
Feature: HereworcsRolebased 

Scenario: superadmin login 
	Given user Launch the Url 
	When user enter the Valid Email Address in User field 
	And user enter the Valid Password in password field 
	And user click the accept in Cookies Button 
	Then user click the Login Button and it Navigates to dashboard 
	
Scenario: Superadmin 
	Given user click the Questionnaries button and It navigates to Questionnaire Builder page 
	When user take The screenshot of the page and click the Main Menu button 
	Then user Click the logout button and it Navigates to login Page 
	
Scenario: Admin login 
	Given user Launch The Url 
	When user Enter the valid Email Address in User field 
	And user enter the valid Password in password field 
	Then user click the Login Button And it Navigates to dashboard 
	
Scenario: Admin 
	Given user click the Team caseload button and It navigates to Caseload overview page 
	When user Take the screenshot Of the page and click the menu and dashboard button 
	And user click the patient overview button and It Navigates to Patient Overview page and repeat The flow 
	And user click the best interest decision button and it Navigates to BID page and Repeat the flow 
	And user click the my clinical caseload button and it navigates to clinical caseload page and repeat The Flow 
	And user Click the Saved Resources button and It navigates to Resources page 
	Then user Click the Logout button and It navigates to Login Page 
	
Scenario: Login 
	Given user launch The Url 
	When user enter the valid Email Address in user field 
	And user Enter the valid Password in Password field 
	Then user Click the Login Button And it navigates to dashboard 
	
Scenario: Clinician 
	Given user click the clinician caseload button and it navigates to Caseload page 
	When user take the Screenshot of the Page and Click the Menu and Dashboard Button 
	And user click the Message button and it naviagtes to Message page and Repeate the Flow 
	And user Click the saved resources button and it navigates to resources page 
	Then user click the Clinician circle button and It Navigates to Circle page and repeat the flow 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
