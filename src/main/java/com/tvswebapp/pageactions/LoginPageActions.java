package com.tvswebapp.pageactions;

import org.openqa.selenium.WebDriver;

import com.tvswebapp.pageobjects.LoginPage;
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
		
		loginPage.getLoginWords();
	}
	
	public void enterMobileNumberAndOtp(String mobileNumber, String OTP)
	{
		
		webElementUIHelperUtil.enterText(loginPage.getMobileNumber(), mobileNumber);
		webElementUIHelperUtil.enterText(loginPage.getEnterOtp(), OTP);
	}
	
	public void clickSubmitButton()
	{
		
		webElementUIHelperUtil.scrollAndClick(loginPage.getSubmitButton());
	}
	
}
