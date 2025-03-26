package com.tvswebapp.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil 
{
	public WebDriver driver;
	
	public WaitUtil(WebDriver driver)
	{
		
		this.driver=driver;
	}
	 
	public void implicitWait(WebDriver driver, long waitTime)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
	}
	public <T> void explicitWait(WebDriver driver, long waitTime, ExpectedCondition<T> expCon)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));
		wait.until(expCon);
	}
}
