@superadmin 
Feature: SuperAdmin 

Scenario: superlogin 
	Given user launch the url 
	When user enter the email address in text box 
	And user enter the password in text box 
	And user Click the Accept cookies Button 
	Then user click the login Button and it naviagtes to home page 
	
Scenario: Questionnaire 
	Given user click the Questionnaire button and it navigates to questionnaire page 
	When user click the create new button and It Navigates to New Questionnaire page 
	And user click the Title button and title Text box shows up 
	And user Enter the questionnaire title in text box 
	And user Click the Welcome Button and Welcome text Box Shows Up 
	And user Enter the welcome message in the text box 
	And user click the Sections button and Title and description shows 
	And user Enter the valid title in section title box 
	And user enter the Valid description in Section Description Box 
	
Scenario: Question Type 
	Given user Click the Question button and it Shows add questions button 
	When user click the Add question button and question types are pop up 
	And user Click the Free text Button and short questions and assign text box occured 
	And user enter the texts in question text box 
	And user select the Assign to section 
	And user Click the Toggle and makes Mandatory 
	And user click the add Question Button and click the Imagery question type 
	And user Enter the question related to the Image 
	And user enter the text to go with the image and select the assign to Section 
	And user Click the Add Question button and Click the dropdown type 
	And user enter the Question requires Dropdown Response 
	And user Enter the reponse options and add another response and Select the Assign to section 
	And user click the add question and click the Multiple choice type 
	And user Enter the valid response question for multichoice 
	And user enter The Response option and add another response and click the sections 
	And user click the add a question button and Click the likert button 
	And user Enter the Question and Requirement of the scale 
	And user enter The Specify range and description for the range 
	Then user Enter the low and high end of the scale and select The assign to Section 
	
Scenario: Closing Info 
	Given user click the closing info button and Click the Add Closing section button 
	When user Click the Privacy notice button and Enter the privacy notes in the text box 
	And user click the Disclaimer Button and enter the Terms and Condition in the Text Box 
	And user Click the What's Next button and Enter the Info 
	And user click the Final statement Button and enter the statement and click the category radio Button 
	Then user Click the Preview button and It navigates to Preview Page 
	
Scenario: Edit Questionnaire 
	Given user click the Edit Button in preview page and it Navigates to Questionnaire edit Page 
	When user Click the Upload Image button and upload an image 
	And user Click the Publish Button and Navigates to Questionnaire page and select Logout button 
	
Scenario: clinician Login 
	Given User Click the URL link 
	When User Enter the email Address in text box 
	And User Enter the password in Text box 
	And User Click the login Button and it naviagtes to Home page 
	And user Click the Clinician menu button and Submenu Questionnaire button and It navigates to Questionnaire dashboard 
	And user Click the questionnaire button and Pop up shows up 
	Then user Click share and Select patient name and Share the Questionnaires 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
