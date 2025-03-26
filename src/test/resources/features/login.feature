@UsersLoginAndSubmit
Feature: User enters all the fields in the Login Page and submit

@User1LoginAndSubmit
Scenario Outline: User enter valid mobile number and valid OTP and clicks on submit button
Given User clicks on Login User Icon
When User Navigates to Login Page
Then User enters valid "<MobileNumber>" and valid "<OTP>"
And click on Submit button

Examples:
|MobileNumber|OTP      | 
|7204780642  |444445   | 
|2345678987  |123123   | 