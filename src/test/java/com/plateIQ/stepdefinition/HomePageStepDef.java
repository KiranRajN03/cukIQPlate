package com.plateIQ.stepdefinition;

import com.plateIQ.stepImplementation.HomePageStepImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {

	@When("^click on invoice tab$")
	public void userClicksOnInvoiceTab(){
		HomePageStepImpl Hpl = new HomePageStepImpl();
		Hpl.clickOnInvoice();
	}
	
	
}
