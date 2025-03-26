package com.tvswebapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//ol[@class='breadcrumb']/li[text()='Login']")
	WebElement loginWords ;
	
	@FindBy(id="userphoneNumber")
	WebElement mobileNumber ;
	
	@FindBy(id="loginOtpNumber")
	WebElement enterOtp ;
	
	@FindBy(xpath="(//div[@class='col-sm-12 text-center group']/button[text()='SUBMIT'])[1]")
	WebElement submitButton ;
	
	public WebElement getSubmitButton() {
		return submitButton;
	}


	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getLoginWords() {
		return loginWords;
	}


	public void setLoginWords(WebElement loginWords) {
		this.loginWords = loginWords;
	}


	public WebElement getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(WebElement mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public WebElement getEnterOtp() {
		return enterOtp;
	}


	public void setEnterOtp(WebElement enterOtp) {
		this.enterOtp = enterOtp;
	}


	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
