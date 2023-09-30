Feature: Scenarios to SalesForce Application


#TestCase10
Scenario: Create Account

Given User is on the "LoginPage"
When user enter into Textbox "Username" "kavi@bharathiraja.com"
When user enter into Textbox "Password" "Password123"
Then user click on LoginButton "Login"
Given User is on the "UsermenuPage"
Then User Clicks on Button "Accounts"
