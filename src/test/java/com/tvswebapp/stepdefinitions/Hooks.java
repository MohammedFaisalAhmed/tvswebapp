package com.tvswebapp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.tvswebapp.utilities.ConfigUtil;
import com.tvswebapp.utilities.DriverFactoryUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	
 public WebDriver driver;
 
 @Before
 public void setUp()
 {
	String requiredBrowser = ConfigUtil.getProperty("browser");
	this.driver =DriverFactoryUtil.getDriver(requiredBrowser);
	
	String requiredUrl = ConfigUtil.getProperty("baseURL");
	driver.get(requiredUrl);
	 
 }
 
 @After
 public void tearDown()
 {
	 if(driver!=null)
	 {
		 driver.quit();
	 }
	 
	 
	 
 }

}
