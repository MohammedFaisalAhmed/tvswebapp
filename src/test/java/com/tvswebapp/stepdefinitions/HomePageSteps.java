package com.tvswebapp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseSteps
{
	WebDriver driver;
	
	@Given("User clicks on Login User Icon")
	public void user_clicks_on_login_user_icon() 
	{
	    
		homePageActions.clickOnLoginIcon();
	}
	
	
	
	
	

}
