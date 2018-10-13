package com.plateIQ.pageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlateIQLoginPage {
	WebDriver driver;
	
	@FindBy(name = "email")
	private WebElement txt_Email;
	
	@FindBy(className = "plateiq-h1")
	private WebElement txt_welcome;
	
	@FindBy(name = "passowrd")
	private WebElement txt_Password;
	
	@FindBy(className = "mat-button-wrapper")
	private WebElement btn_signIn;
	
	public PlateIQLoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName(String userName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(txt_Email));
		txt_Email.clear();
		txt_Email.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		txt_Password.clear();
		txt_Password.sendKeys(password);
	}
	
	public void validateWelcomeMessage(String welcomeMessage) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(txt_welcome));
		String vldtMsg = txt_welcome.getText().toString();
		System.out.println(vldtMsg);
		if(vldtMsg.equalsIgnoreCase(welcomeMessage))
		{
			
			assertTrue("Welcome message Validated", true);
		}
		else
		{
			
			assertFalse("Welcome message Validated", false);
		}
	}

	public void clickOk() 
	{
		btn_signIn.click();
	}
	
}
