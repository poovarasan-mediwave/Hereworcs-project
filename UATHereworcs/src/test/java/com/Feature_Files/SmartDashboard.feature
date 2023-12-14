@SmartDashboard 
Feature: Smart Dashboard page

  Scenario: Login
    Given user launch the Browser for Smart Dashboard
    When user click the Login button for Smart Dashboard
    And user enter the username in the field for Smart Dashboard
    And user enter the password in the password field for Smart Dashboard
    Then user click the login button and page navigates to the home page for Smart Dashboard

  Scenario: Smart Dashboard page Add items  
  Given user click on Add dashboard item for smart Dashboard
  When user click on close message popup for smart Dashboard
  Then user click on my location button for smart Dashboard
  Then user click on My diary for smart Dashboard
  Then user click on My tracker overview for smart Dashboard
  Then user click on My fast tracker log for smart Dashboard
  Then user click on My messages for smart Dashboard
  Then user click on My appointments for smart Dashboard
  Then user click on My circle for smart Dashboard
  Then user click on My recommended resources for smart Dashboard
  Then user click on My saved resources for smart Dashboard
  
  Scenario: Remove Smart Dashboard page items  
  Given user click on remove my location button for smart Dashboard
  When user click on remove My diary button for smart Dashboard
  Then user click on remove My tracker overview for smart Dashboard
  Then user click on remove My fast tracker log for smart Dashboard
  Then user click on remove My messages button for smart Dashboard
  Then user click on remove My appointments button for smart Dashboard
  Then user click on remove My circle button for smart Dashboard
  
  Then user click on remove My recommended resources for smart Dashboard
  Then user click on remove My saved resources for smart Dashboard   
  