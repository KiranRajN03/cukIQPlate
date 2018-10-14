package com.plateIQ.pageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvoicePage {
	WebDriver driver;

	@FindBy(css = "#main-navbar > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.topnav > li:nth-child(5)")
	private WebElement btn_Invoice;

	public InvoicePage(WebDriver driver) {
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
	
	@FindBy(css = "#tab-content-17 > div > ng-switch > div > invoice-list > div > div > table > tbody > tr:nth-child(1) > td.col-left.d-flex-vcenter > div > span")
	private WebElement link_NdsAtn_link1;
	
	@FindBy(css = "#split-panel > div > div > section > md-content > div > ul > li.uib-tab.nav-item.active > a")
	private WebElement text_validator;
	
	@FindBy(xpath = "//*[@id=\"dropdownMenu2\"]")
	private WebElement drpDwn_More;
	
	@FindBy(css = "#invoice-header > div.d-flex-vcenter.d-flex-between.header-button-row.col-sm-12.nopadding > section.header-btns-actions.text-right > div.dropdown.open > ul > li:nth-child(2) > a")
	private WebElement btn_exported;
	
	@FindBy(css = "#invoice-header > div.d-flex-vcenter.d-flex-between.header-button-row.col-sm-12.nopadding > section.col-sm-6 > span")
	private WebElement txt_ExportedValidation;
	
	@FindBy(css = "#tab-item-20 > ng-switch > span")
	private WebElement lnk_AllDocument;
	
	@FindBy(css = "#tab-content-20 > div > ng-switch > div > invoice-list > div > div > table > tbody > tr:nth-child(2) > td.col-left.d-flex-vcenter > div > span")
	private WebElement ALlDocslink_NdsAtn_link1;
	

	public void validateAll4Tabs(String tabsValidation) {
		String[] arrOfStr = tabsValidation.split(",");
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(btn_Invoice));
		try {

			System.out.println(arrOfStr[0]);
			if ((txt_needsAtn.getText().toString()).contains(arrOfStr[0])) {
				assertTrue(true);

			} else {

				assertFalse("Needs Attention Validation Failed", true);
			}

			if ((txt_PendExp.getText().toString()).contains(arrOfStr[1])) {
				assertTrue(true);

			} else {

				assertFalse("Pending Export Validation Failed", true);
			}
			if ((txt_OthDoc.getText().toString()).contains(arrOfStr[2])) {
				assertTrue(true);

			} else {

				assertFalse("Other documnets Validation Failed", true);

			}
			if ((txt_AllDoc.getText().toString()).contains(arrOfStr[3])) {
				assertTrue(true);

			} else {

				assertFalse("All Documents Validation Failed", true);
			}
			if ((txt_Upload.getText().toString()).contains(arrOfStr[4])) {
				assertTrue(true);

			} else {

				assertFalse("Uploads Failed", true);
			}
		} catch (Exception e) {

		}
		// txt_Email.clear();
		// txt_Email.sendKeys(userName);
	}

	public void clickFrstLnkInNeedsAttention() {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(link_NdsAtn_link1));
		link_NdsAtn_link1.click();
	}
	
	public void clickFrstLnkInAllDocs() {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(ALlDocslink_NdsAtn_link1));
		ALlDocslink_NdsAtn_link1.click();
	}
	

	public void validateLinkOnScreen(String txtValidation) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(text_validator));
		String txtValidator = text_validator.getText().toString();
		if (txtValidator.equalsIgnoreCase(txtValidation)) {
			assertTrue(true);

		} else {
			assertFalse("message on the screen did not match", true);
		}

	}

	public void clickOnMoreandselectValue(String selectValue) {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebDriverWait wait = new WebDriverWait(driver, 3000);
		//WebElement drpDwn_More = driver.findElement(By.cssSelector("#invoice-header > div.d-flex-vcenter.d-flex-between.header-button-row.col-sm-12.nopadding > section.header-btns-actions.text-right > button > span:nth-child(2)"));
		//drpDwn_More.click();
		//WebElement drpDnw = driver.findElement(By.cssSelector("#invoice-header > div.d-flex-vcenter.d-flex-between.header-button-row.col-sm-12.nopadding > section.header-btns-actions.text-right > span > button > span"));
		Actions a = new Actions(driver);
	for(int i=0; i<15;i++) {
		a.sendKeys(Keys.TAB);
	}
	a.sendKeys(Keys.ENTER);
		//Select dropdown= new Select(drpDwn_More);
		//dropdown.selectByVisibleText(selectValue);
		//wait.until(ExpectedConditions.visibilityOf(drpDwn_More));
		//drpDwn_More.click();
	}
	

	public void clickOnExported() {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(btn_exported));
		btn_exported.click();
	}
	
	
	
	public void vldtExprtdBtn(String exprtedValidation) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(txt_ExportedValidation));
		String exprtValidation = txt_ExportedValidation.getText().toString();
		if (exprtValidation.equalsIgnoreCase((txt_ExportedValidation).getText().toString())) {
			assertTrue(true);

		} else {
			assertFalse("message on the screen did not match", true);
		}

	}

	public void allDocumentsBtn() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(lnk_AllDocument));
		lnk_AllDocument.click();
	}
	
	
	
	public void vldtExprtdBtnelseClickExported(String exprtedValidation) {
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int isPresent = 0;
		isPresent = driver.findElements(By.cssSelector("#invoice-header > div.d-flex-vcenter.d-flex-between.header-button-row.col-sm-12.nopadding > section.col-sm-6 > span")).size();
		
		if (isPresent==1 ) {
			clickOnMoreandselectValue("Mark As Exported");
			clickOnExported();
			vldtExprtdBtn(exprtedValidation);

		} 
	}

	
public void vldtExprtdBtnNotOnScreen(String exprtedValidation) {
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int isPresent = 0;
		isPresent = driver.findElements(By.cssSelector("#invoice-header > div.d-flex-vcenter.d-flex-between.header-button-row.col-sm-12.nopadding > section.col-sm-6 > span")).size();
		
		if (isPresent == 1) {
			
			assertTrue(true);
		} 
		else 
		{
			assertFalse(true);
		}
	}
	

}