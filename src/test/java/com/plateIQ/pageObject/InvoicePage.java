package com.plateIQ.pageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvoicePage {
	WebDriver driver;

	@FindBy(css = "#main-navbar > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.topnav > li:nth-child(5)")
	private WebElement btn_Invoice;
	
	public InvoicePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#tab-item-17 > ng-switch > span")
	private WebElement txt_needsAtn;
	@FindBy(css = "#tab-item-18 > ng-switch > span")
	private WebElement txt_PendExp;
	@FindBy(css = "#tab-item-19 > ng-switch > span")
	private WebElement txt_OthDoc;
	@FindBy(css = "#tab-item-20 > ng-switch > span")
	private WebElement txt_AllDoc;
	@FindBy(css = "#tab-item-21 > ng-switch > span")
	private WebElement txt_Upload;
	public void validateAll4Tabs(String tabsValidation)
	{
		String[] arrOfStr = tabsValidation.split(",");
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(btn_Invoice));
		
		System.out.println(arrOfStr[0]);
		if(arrOfStr[0].contains(txt_needsAtn.getText().toString()))
		{
			assertTrue(true);
			
		}
		else
		{
			
			assertFalse("Needs Attention Validation Failed", false);
		}
			
		
		if(arrOfStr[0].contains(txt_PendExp.getText().toString()))
		{
			assertTrue(true);
			
		}
		else
		{
			
			assertFalse("Pending Export Validation Failed", false);
		}
		if(arrOfStr[0].contains(txt_OthDoc.getText().toString()))
		{
			assertTrue(true);
			
		}
		else
		{
			
			assertFalse("Other documnets Validation Failed", false);
			
		}
		if(arrOfStr[0].contains(txt_AllDoc.getText().toString()))
		{
			assertTrue(true);
			
		}
		else
		{
			
			assertFalse("All Documents Validation Failed", false);
		}
		if(arrOfStr[0].contains(txt_Upload.getText().toString()))
		{
			assertTrue(true);
			
		}
		else
		{
			
			assertFalse("Uploads Failed", false);
		}
	
		//txt_Email.clear();
		//txt_Email.sendKeys(userName);
	}
}