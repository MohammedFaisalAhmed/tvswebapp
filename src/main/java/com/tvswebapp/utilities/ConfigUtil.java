package com.tvswebapp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigUtil 
{
	static Properties properties;
	static String env;
	static String browser;
	
	
	public static void loadProperties()
	{
		try
		{
			properties = new Properties();
			env=System.getProperty("env","stage");
			browser=System.getProperty("browser", "Chrome");
			FileInputStream fileInputStream = new FileInputStream("src/main/resources/configs/"+env+".properties");
			properties.load(fileInputStream);
			
		} 
		
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static  String getProperty(String key)
	{
		loadProperties();
		return properties.getProperty(key);

	}
	
	public static  String getEnvironment()
	{
		loadProperties();
		return env;
		
	}
public static  String getBrowser()
{
	
	loadProperties();
	return browser;
}
}
