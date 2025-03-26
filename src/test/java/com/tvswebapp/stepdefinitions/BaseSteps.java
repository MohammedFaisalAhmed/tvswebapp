package com.tvswebapp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.tvswebapp.pageactions.HomePageActions;
import com.tvswebapp.pageactions.LoginPageActions;
import com.tvswebapp.utilities.ConfigUtil;
import com.tvswebapp.utilities.DriverFactoryUtil;

public class BaseSteps 
{
	public WebDriver driver;
	protected HomePageActions homePageActions;
	protected LoginPageActions loginPageActions;

	public BaseSteps()
	{

		String browser =ConfigUtil.getProperty("browser");
		this.driver= DriverFactoryUtil.getDriver(browser);
		initializePages();


	}

	public void initializePages()
	{

		homePageActions = new HomePageActions(driver);
		loginPageActions = new LoginPageActions(driver);

	}


}
