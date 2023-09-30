Feature:Login Scenarios to SalesForce Application

#TestCase1

Scenario: ClearPasswordfiled and login with valid username
Given User is on the "LoginPage"
When user enter into Textbox "Username" "kavi@bharathiraja.com"
When user enter into Textbox "Password" "Pass"
Then user clear the passwordTextbox "Password"
Then user click on LoginButton "Login" 
#And validate the error message "loginError"

#TestCase2

Scenario: Enter Valid username, Password and login To SalesForce 
Given User is on the "LoginPage"
When user enter into Textbox "Username" "kavi@bharathiraja.com"
When user enter into Textbox "Password" "Password123"
Then user click on LoginButton "Login" 

#TestCase4 

Scenario: Enter Valid username, click on ForgotPassword and get email
Given User is on the "LoginPage"
When user enter into Textbox "Username" "kavi@bharathiraja.com"
When user click on ForgotPasswordlink "Forgotpassword"
When user enter into Textbox "FPusername" "kavitha.bharathiraja@gmail.com"
Then User click on ContinueButton "continuelogin"


#TestCase5

Scenario: Enter Invalid username, Password and login To SalesForce
Given User is on the "LoginPage"
When user enter into Textbox "Username" "12345"
When user enter into Textbox "Password" "123"
Then user click on LoginButton "Login" 

#TestCase3

Scenario: Enter Valid username, Password, click on RemembermeButton and login To SalesForce
Given User is on the "LoginPage"
When user enter into Textbox "Username" "kavi@bharathiraja.com"
When user enter into Textbox "Password" "Password123"
When user click on RememberMeButton "RememberMe"
Then user click on LoginButton "Login"

