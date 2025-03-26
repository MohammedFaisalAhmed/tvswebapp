package com.tvswebapp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseSteps 
{
WebDriver driver;

@When("User Navigates to Login Page")
public void user_navigates_to_login_page() 
{
  loginPageActions.verifyLoginWordings();
}

@Then("User enters valid {string} and valid {string}")
public void user_enters_valid_and_valid(String mobileNumber, String OTP) 
{
   loginPageActions.enterMobileNumberAndOtp(mobileNumber, OTP);
}

@Then("click on Submit button")
public void click_on_submit_button() 
{
   loginPageActions.clickSubmitButton();
}




}
