package com.tvswebapp.utilities;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElementUIHelperUtil 
{
	public WebDriver driver;
	WaitUtil waitUtil;
	
	public WebElementUIHelperUtil(WebDriver driver)
	{
		this.driver=driver;
		this.waitUtil= new WaitUtil(driver);
		
	}
	
	public void clickWithImplicitWait(WebElement element)
	{
		
		waitUtil.implicitWait(driver,30);
		element.click();
	}
	
	public void scrollWaitAndClick(WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		waitUtil.explicitWait(driver,30, ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
	public void enterText(WebElement element,String input)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		element.sendKeys(input);
	}
	
	public void scrollAndClick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		element.click();
		
	}
	
	

}
