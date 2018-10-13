package com.plateIQ.stepImplementation;

import com.plateIQ.pageObject.InvoicePage;
import com.plateIQ.utility.BrowserInteraction;

public class InvoiceStepImpl {
	public void validateTabs(String tabsValidation) 
	{
		InvoicePage invoice = new InvoicePage(BrowserInteraction.driver);
	
		invoice.validateAll4Tabs(tabsValidation);
	}


}
