package com.tvswebapp.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features="src/test/resources/features/login.feature",
	glue= {"com.tvswebapp.stepdefinitions"},
	tags= "@UsersLoginAndSubmit",
	plugin={"pretty","html:target/cucumber-reports.html"},
	monochrome=true	
		
)


public class TestRunner extends AbstractTestNGCucumberTests
{
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios()
{
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	
	


}
