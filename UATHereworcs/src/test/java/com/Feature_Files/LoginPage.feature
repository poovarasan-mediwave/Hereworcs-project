@smoke
Feature: Southern Parent Portal Login

  @LoginPage
  Scenario Outline: Login to Hereworcs Application
    Given User need to launch the browser
    When User enters email address in "<email>" field
    When user enters passwoed in "<password>" field
    Then user clicks to accept cookies
    Then user click Login
    
    Then User navigated to Home Page

Examples:
|email|password|
|sathyasuba27@gmail.com|Admin@1234|