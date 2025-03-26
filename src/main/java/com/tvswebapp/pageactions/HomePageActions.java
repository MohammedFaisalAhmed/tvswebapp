package com.tvswebapp.pageactions;

import org.openqa.selenium.WebDriver;

import com.tvswebapp.pageobjects.HomePage;
import com.tvswebapp.utilities.WebElementUIHelperUtil;

public class HomePageActions 
{
	HomePage homePage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public HomePageActions(WebDriver driver)
	{
		this.homePage= new HomePage(driver);
		this.webElementUIHelperUtil = new WebElementUIHelperUtil(driver);
	}
	
	public void clickOnLoginIcon()
	{
		
		webElementUIHelperUtil.clickWithImplicitWait(homePage.getLoginIcon());
	}

}
