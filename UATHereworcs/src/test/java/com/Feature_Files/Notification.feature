@Notification
Feature: verify Notification 

Scenario: Notification page 
Given User launch URL for Notification
When User click on cookies button for notification

Then User enters valid "<email address>" in Emailaddres field for Notification
Then User enters "<password>" in Passowrd for Notification
Then Click on Submit button for Notification
Then Click on Notification icon
Then Click on go to notification page button