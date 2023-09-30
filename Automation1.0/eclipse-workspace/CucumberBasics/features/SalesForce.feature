Feature: Login Scenarios to SalesForce Application


#TestCase1

Scenario: ClearPasswordfiled and login with valid username

Given User launch the SalesForce application
When user enter the valid username
Then user clear the passwordfiled
And user click on LoginButton.
