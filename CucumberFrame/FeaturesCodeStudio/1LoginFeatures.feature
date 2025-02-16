Feature: login

# https://demo.nopcommerce.com/login


Background:
Given User launch Browser


@Sanity
Scenario: Login with Valid Credentials

When User open Url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And User enter username "Admin" and password "admin123"
And User Click on Login button
Then Navigate to DashBoard and PageTitle Should be "OrangeHRM"
And Close the Brower


@regression
Scenario Outline: Login with Valid Credentials

When user open Url "https://naveenautomationlabs.com/opencart/"
And user Enter SearchName as "<search>"
And User Click On Search button
  
Examples:
|search|
|Mac|
|Desktop|



