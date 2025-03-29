package com.tvswebapp.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager 
{
	static ThreadLocal<ExtentTest> extentTest = new ThreadLocal();
	static ExtentReports extentReports;
	
	public static ExtentReports getExtentReport()
	{
		if(extentReports==null)
		{

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timeStamp=simpleDateFormat.format(new Date());
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("test-output/Extentreport_"+timeStamp+".html");
		extentSparkReporter.config().setDocumentTitle("TVS WEB APP AUTOMATION REPORT");
		extentSparkReporter.config().setReportName("Test-Execution report");
        extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		}
		return extentReports;
	}
	
	public static ExtentTest getTest()
	{
		
		return extentTest.get();
	}
	
	public static synchronized void createTest(String testName)
	{
		
		ExtentTest test = getExtentReport().createTest(testName);
		extentTest.set(test);

	}
	
	public static void flushReport()
	{
		if(extentReports!=null)
		{
			
			extentReports.flush();
		}
		
	}
	
	

}
