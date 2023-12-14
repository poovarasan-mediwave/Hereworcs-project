@Login
Feature: Login Hereworc

Scenario Outline: Login
Given user Launch The Browser
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
And user click the accept cookies button
Then user Click The Sigin button and Page Navigates to Home Page

Examples:
|username|password|
|makeswaran26@gmail.com| 00000|
|makeswaran2610@gmail.com|234567|
|makesmadhan@gmail.com|Admin@123|
|makeswaran2610@gmail.com|Admin@123|