package com.tvswebapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='/account/login']")
	private WebElement loginIcon ;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginIcon() {
		return loginIcon;
	}

	public void setLoginIcon(WebElement loginIcon) {
		this.loginIcon = loginIcon;
	}

	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
