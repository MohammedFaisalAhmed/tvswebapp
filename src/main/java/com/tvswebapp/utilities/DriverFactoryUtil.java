package com.tvswebapp.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactoryUtil 
{
	
	final static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver(String browser)
	{
		if(driver.get()==null)
		{
		switch(browser)
		{
		case "Chrome":
		{
			driver.set(new ChromeDriver());
			break;
		}
		case "FireFox":
		{
			driver.set(new FirefoxDriver());
			break;
		}
		case "Edge":
		{
			driver.set(new EdgeDriver());
			break;
		
		}
		default: 
			throw new RuntimeException("There is no browser");
		
		}
		driver.get().manage().window().maximize();
	}
	return driver.get();
}
	
	public static void closeDriver()
	{
		if(driver.get()!=null) //browser is open
		{
			driver.get().quit();
			
		}
		
	}
}
