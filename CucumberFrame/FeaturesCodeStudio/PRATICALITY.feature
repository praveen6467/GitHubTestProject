Feature: Login Feature


Background:
Given User launch Chrome Browser


@Sanity
Scenario: login with valid credentials

When User open url as "https://testautomationpractice.blogspot.com/"
When User Enter Name as  "Praveen" and Email as "padigampraveen6467@gmail.com"
When User Click on male Gender 
Then PageTitle Should be "Automation Testing Practice"
And Close the Browser


@Regression @Sanity
Scenario Outline: Login with multiple inputData

When User open url as a "https://www.saucedemo.com/v1/index.html" 
When User Enter username as "<Username>"  and Password "<Password>"
When User Click on LoginButton
Then open the Dashboard with title "Swag Labs"
And Click On About


Examples:
|Username|Password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|


