package com.plateIQ.stepImplementation;

import com.plateIQ.pageObject.InvoicePage;
import com.plateIQ.utility.BrowserInteraction;

public class InvoiceStepImpl {
	InvoicePage invoice = new InvoicePage(BrowserInteraction.driver);
	public void validateTabs(String tabsValidation) {
		//InvoicePage invoice = new InvoicePage(BrowserInteraction.driver);

		invoice.validateAll4Tabs(tabsValidation);
	}

	public void ClickOnFirstLinkOfNeedSAttention() {
		//InvoicePage invoice = new InvoicePage(BrowserInteraction.driver);

		invoice.clickFrstLnkInNeedsAttention();
	}
	
	public void ClickOnFirstLinkOfAllDocs() {
		//InvoicePage invoice = new InvoicePage(BrowserInteraction.driver);

		invoice.clickFrstLnkInAllDocs();
	}
	

	public void validateLinkOnScreen(String tabsValidation) {
		//InvoicePage invoice = new InvoicePage(BrowserInteraction.driver);

		invoice.validateLinkOnScreen(tabsValidation);
	}

	public void clickMoreOnInvoicePage(String selectValue) {
		invoice.clickOnMoreandselectValue(selectValue);
	}
	public void clickOnExportedInInvoicePage()
	{
		invoice.clickOnExported();
	}

	
	
	public void validateIfExportedButtonIsDisplayed(String exportText, int data) {
		if (data==0) {
		invoice.vldtExprtdBtn(exportText);
		}
		if(data==1) {
			invoice.vldtExprtdBtnelseClickExported(exportText);
		}
	}
	
	
	public void validateIfExportedButtonIsNotDisplayed(String exportText) {
		
			invoice.vldtExprtdBtnNotOnScreen(exportText);
		
	}
	
	
	
	public void clkOnAllDocuments() {
		invoice.allDocumentsBtn();
	}
	
	
}
