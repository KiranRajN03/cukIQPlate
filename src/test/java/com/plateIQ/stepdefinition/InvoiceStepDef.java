package com.plateIQ.stepdefinition;

import com.plateIQ.stepImplementation.InvoiceStepImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvoiceStepDef {
	InvoiceStepImpl Ipl = new InvoiceStepImpl();
	@Then("^validate the tabs (.*)$")
	public void userClicksOnInvoiceTab(String tabsValidation) {
		//InvoiceStepImpl Ipl = new InvoiceStepImpl();
		Ipl.validateTabs(tabsValidation);
	}

	@When("^User clicks on first link of needs Attention$")
	public void userClicksOnFirstLinkOfNeedsAttention() {
		//InvoiceStepImpl Ipl = new InvoiceStepImpl();
		Ipl.ClickOnFirstLinkOfNeedSAttention();
	}
	
	@When("^User clicks on first link of All Documents$")
	public void userClicksOnFirstLinkOfAllDocuments() {
	Ipl.ClickOnFirstLinkOfAllDocs();
}

	@Then("^validate text on the Screen (.*)$")
	public void validateTheLinkOnScreen(String validateLink) {
		//InvoiceStepImpl Ipl = new InvoiceStepImpl();
		Ipl.validateLinkOnScreen(validateLink);
	}
	@When("^user clicks on More (.*)$")
	public void invoiceMoreDrpDwn(String valueToSelect)
	
	{
		Ipl.clickMoreOnInvoicePage(valueToSelect);
	}
	
	@When("^user clicks on Exported$")
	public void userClicksOnExported()
	{
		Ipl.clickOnExportedInInvoicePage();
	}
	
	@Then("^validate value exported text is not on the screen (.*)$")
	public void exportedTxtNotOnScreen(String exportValue) {
		Ipl.validateIfExportedButtonIsNotDisplayed(exportValue);
	}
	@When("^user clicks on not Exported$")
	public void userClicksOnNotExported()
	{
		Ipl.clickOnExportedInInvoicePage();
	}
	
	@Then("^validate exported text on the screen (.*)$")
	public void exportedTxtOnScreen(String exportValue) {
		int data = 0;
		Ipl.validateIfExportedButtonIsDisplayed(exportValue, data);
	}
	

	
	@Then("^validate value exported text on the screen (.*)$")
	public void exportedTxtOnScreenElseClickOnExported(String exportValue) {
		int data = 1;
		Ipl.validateIfExportedButtonIsDisplayed(exportValue, data);
	}
	
	@When("^User clicks on All Documents$")
	public void clickOnAllDocuments() {
		Ipl.clkOnAllDocuments();
	}
}
