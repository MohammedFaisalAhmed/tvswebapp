package com.tvswebapp.stepdefinitions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.tvswebapp.utilities.ConfigUtil;
import com.tvswebapp.utilities.DriverFactoryUtil;
import com.tvswebapp.utilities.ExtentManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks 
{
	
 public WebDriver driver;
 
 @Before
 public void setUp(Scenario scenario)
 {
	String requiredBrowser = ConfigUtil.getBrowser();
	this.driver =DriverFactoryUtil.getDriver(requiredBrowser);
	
	String requiredUrl = ConfigUtil.getProperty("baseURL");
	driver.get(requiredUrl);
	
	ExtentManager.createTest(scenario.getName());
	ExtentManager.getTest().log(Status.INFO, "Test-Case started"+scenario.getName());
	
	 
 }
 
 @After
 public void tearDown(Scenario scenario)
 {
	 if(scenario.isFailed())
	 {
		 byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 scenario.attach(screenshot, "image/jpeg", "faile-screenshot");
		 ExtentManager.getTest().log(Status.FAIL, "Test-Case Failed"+scenario.getName());
		 ExtentManager.getTest().addScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64));
		 
	 }
	 else
	 {
		ExtentManager.getTest().log(Status.PASS, "Test-Case Pass"+scenario.getName()); 
		 
	 }
	 DriverFactoryUtil.closeDriver();

	 
	 ExtentManager.flushReport();
	 
 }

}
