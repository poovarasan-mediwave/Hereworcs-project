@Location
Feature: Add Location in Dashboard Item

  Scenario: Login
    Given user launch the browser
    When user enter the username
    And user enter the password
    And user accept cookies
    Then click signin button and navigates to home page

  Scenario: Add Location in Dashboard
    When user click the Add icon from My Dashboard Item
    And user click the Continue button in popup
    Then user take screenshot of my location added in a dashboard item

  Scenario: Add Diary and click on Add entry button for negative case
     When user Click add button
     Then user Click Add Entry button for validation
  Scenario: Add Diary and page navigates to diary page from Dashboard
    And user Took Screenshot in added Dashboard item
    And user Add data in Diary Entry Field
    And user Click Add Entry button
    And user Click take me to Diary button and page Navigates to Diary page
    Then user Take Screenshot in diary page

  Scenario: Add Tracker in Dashboard
    #When user Add the My Tracker Overview in Dashboard
    #And user click the continue button in the popup
    #And user select the mood tracker
    #And user select the fluid tracker
    #And user select the Exercise tracker
    #And user select the month to get a report for the month
    #Then user finally take a Screenshot
    
      
  Scenario: add fast log in dashboard item
     #When user click add icon and click continue button
     #Then user check added item in dashboard and took screenshot
  
  
  Scenario: Add Messages
     #When user add messages in my dashboard
    #And user click the continue button
    #And user took screenshot added in dashboard
    #And user click go to message button and page navigates to message page
    #Then user click on particular person and message section will open
    
    
  Scenario: Add My Appointment in dashboard
    #When user click the add button in the dashboard
    #And user took screenshot
    #And user click My appointment button and page navigates to appointment page
    #Then user took screenshot in appoint ment page
    
    
  Scenario: Add My circle
    #When user add the my circle in dashboard
    #And user check added Dashboard item
    #And user click the invite button and page redirects to my circle page
    #Then user scroll down and took screenshot
      
  Scenario: add My Recommended Resourses in Dashboard Item
    #When user click the Add Icon
    #And user check the Added item and take screenshot
    #And user click the view button and page navigates to particular page
    #Then Took a Screenshot
    
    
      Scenario: Add saved Resources
      #When user add the saved resource item
      #And user check the added item and took screenshot
      #And user click the view buttton and navigates to saved resources page
      #Then user check the particular page  """
