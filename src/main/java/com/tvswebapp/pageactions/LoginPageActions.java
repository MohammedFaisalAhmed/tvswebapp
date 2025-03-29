package com.tvswebapp.pageactions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.JsonNode;
import com.tvswebapp.pageobjects.LoginPage;
import com.tvswebapp.utilities.JsonUtil;
import com.tvswebapp.utilities.WebElementUIHelperUtil;

public class LoginPageActions 
{
	LoginPage loginPage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public LoginPageActions(WebDriver driver)
	{
		
		this.loginPage= new LoginPage(driver);
		this.webElementUIHelperUtil= new WebElementUIHelperUtil(driver);
	}

	public void verifyLoginWordings()
	{
		
		boolean status =loginPage.getLoginWords().isDisplayed();
		Assert.assertTrue(status);
		}
	
	public void enterMobileNumberAndOtp(String mobileNumber, String OTP)
	{
		
		webElementUIHelperUtil.enterText(loginPage.getMobileNumber(), mobileNumber);
		webElementUIHelperUtil.enterText(loginPage.getEnterOtp(), OTP);
	}
	
	public void enterUserDetails(String userName)
	{
		JsonNode userData =JsonUtil.getuserDataByUsername(userName);
		String mobileNumber=userData.get("MobileNumber").asText();
		
		String OTP = userData.get("OTP").asText();
				
		webElementUIHelperUtil.enterText(loginPage.getMobileNumber(), mobileNumber);
		webElementUIHelperUtil.enterText(loginPage.getEnterOtp(), OTP);
	}
	
	public void clickSubmitButton()
	{
		
		webElementUIHelperUtil.scrollAndClick(loginPage.getSubmitButton());
	}
	
}
