package com.plateIQ.stepdefinition;

import com.plateIQ.stepImplementation.InvoiceStepImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvoiceStepDef {

	@Then("^validate the tabs (.*)$")
	public void userClicksOnInvoiceTab(String tabsValidation){
		InvoiceStepImpl Ipl = new InvoiceStepImpl();
		Ipl.validateTabs(tabsValidation);
	}
	
	
}
