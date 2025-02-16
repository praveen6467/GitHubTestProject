Feature: Login Functionality


Background:
Given User launch Browser
When User open uri

@smoke
Scenario: Login with Valid Inputs

And User enter Name
And  User Email 
And User select Gender


@regression
Scenario: Login With Invalid Inputs

And User select Day as Sunday 
And User Select Country as Germany
Then Close the Browser


