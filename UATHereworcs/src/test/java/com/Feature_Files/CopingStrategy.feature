@CopingStrategy
Feature: Enter data in Coping Strategy

  @Logintoapplication
  Scenario: Login to Hereworcs Web application
    Given User Enter Url for coping strategies
    When User enter  "<email address>" inputs the email address for coping 
    Then user enter valid "<password>" in password field for coping
    Then user then accepts cookies for coping
    Then user then clicks the login button for coping 
    Then User then has to navigate to home page of dashboard for coping
    
    
    @AddcopingStrategy
    Scenario: To add Coping Strategy
    When Patients has clicked the main menu in dashboard page for coping
    Then user click the tracker in main menu for coping
    Then user clicks coping strategy menu
    Then User clicks add coping strategy button
    Then User enters input in title field
    Then User enters input in description field
    Then User clicks save button
    #Then User click on Back to strategies button
    
    
    #Scenario: To add dairy data
    #Given When Patient user2 has clicked the mainmenu in dashboard page
    #Then user2 click the trackers in main menu
    #Then user2 has to click dairymenu
    #Then user2 clicks date field
    #Then user2 selects date
    #Then user2 has to enter input in description field
    #Then User2 need to save dairy