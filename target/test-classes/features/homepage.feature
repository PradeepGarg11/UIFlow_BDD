Feature: Validation of Home page.

@test1
Scenario: Test Home page
Given Browser launched succesully
Then Home page is displayed

@test2
Scenario: Test login error
Given Browser launched succesully
When Click on login form
And Click on login button
Then Error message is displayed