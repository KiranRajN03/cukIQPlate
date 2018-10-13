package com.plateIQ.pageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	@FindBy(css = "#main-navbar > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.topnav > li:nth-child(5)")
	private WebElement btn_Invoice;
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickInvoice()
	{
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(btn_Invoice));
		btn_Invoice.click();
		//txt_Email.clear();
		//txt_Email.sendKeys(userName);
	}
}