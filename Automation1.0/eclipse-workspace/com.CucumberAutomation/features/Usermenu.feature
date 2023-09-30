Feature: Scenarios to SalesForce Application

#TestCase6

Scenario: check for UserMenu dropdown @priority 1

Given User is on the "LoginPage"
When user enter into Textbox "Username" "kavi@bharathiraja.com"
When user enter into Textbox "Password" "Password123"
Then user click on LoginButton "Login" 
Given User is on the "UsermenuPage"
Then Click on UserMenu dropDown "UserMenu"
#And the following options should be displayed:
      | My profile |
      | My Settings |
      | Developer Console |
      | Logout |
      | Switching to lightning Experience |
 
#Testcase7 

Scenario: Select My Profile from username drop down
Given User is on the "LoginPage"
When User enter into Textbox "Username" "kavi@bharathiraja.com"
And User enter into Textbox "Password" "Password123"
And User clicks on element "Login"
Given User is on the "UsermenuPage"
When User clicks on element "UserMenu" 
And User clicks on element "MyProfile"
Given User is on the "MyProfilePage"
When User clicks on element "EditProfileButton"
Given User is on the "EditProfileFramePage"
Then Assert list in "EditProfileFrame"
| About|
|Contact|
When User clicks on element "About"
And User enter into Textbox "Lastname" "Bharathi"
And User clicks on element "SaveAllButton"
Given User is on the "MyProfilePage"

#Testcase8

Scenario: Open Developer Console @priority 1

    Given the user is logged in "LoginPage"
    When User enter into Textbox "Username" "kavi@bharathiraja.com"
    And User enter into Textbox "Password" "Password123"
    And User clicks on element "Login"
    When the user selects the user menu for "UsermenuPage"
    And the user clicks on the Developer Console link "DeveloperConsole"
    Then the Developer Console should be opened "DeveloperConsolepage"
    When the user clicks on the close button of the Developer Console browser "Closebutton"
    Then the Developer Console should be closed "closed"








 