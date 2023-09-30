Feature: SFLoginPage Scenarios

  Background: Launch Salesforce Application

  Scenario: ClearPassword and then Login
     Given usser is on loginpage
     When Enter valid username
     And clear Password filed
     Then click on Login buttton
