@circle 
Feature: HereworcsCircle 

Scenario: Circlelogin 
	Given user launch the UrL for circle 
	When user enter the Valid email address in user field for Circle 
	And user Enter the Valid Password in Password field For circle 
	And user click the accept in cookies button for Circle 
	Then user click the login Button And it navigates to dashboard of Circle flow 
	
Scenario: circleflow 
	Given user click the notification and request pending pop ups 
	When user click the view now button it navigates to my circle invite page 
	And user click the decline and Yes button success message pop ups 
	Then user click logout button and it navigates to login page 
	
Scenario: Mycircle 
	Given user enter the valid Email id in User textbox 
	When user enter the Valid Password in password Textbox 
	And user Click the login button and It Navigates to main dashboard 
	And user Click the Main menu and My circle button and it navigates to my circle page 
	And user click the add new person button and it shows relationship popups 
	And user click the family and friends button and it shows details 
	And user Enter the First and last name and Email Address in the details 
	And user Click the person can see buttons in the Details 
	Then user click the invite button and success message shows up 
	
Scenario: Clinician 
	Given user click the Relationship button and it shows pop ups 
	When user select the clinician button and it shows details 
	And user enter the Hospital and first and last name in the details 
	And user enter the Speciality and email address in the Details 
	And user Click the Person Can See Button in the details 
	Then user click the Invite button and Success message pops up 
	
Scenario: Clinicianlogin 
	
	Given user enter the valid email address in user Text Box
	When user Enter the valid Password in Password Text box
	And user click the login Button And it navigates to dashboard of clinician flow
	And user click the Notification and Request pending shows up
	And user click the View Now Button it Navigates to My circle Invite page
	And user click the Decline button and Yes Button success messages shows up
	Then user click the Logout button and It navigates to Login page
	
	
	
