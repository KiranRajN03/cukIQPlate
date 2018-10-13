package com.plateIQ.stepdefinition;

import com.cucumber.listener.Reporter;
import com.plateIQ.utility.BrowserInteraction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserInteractionStepDef {

	@Given("^user launches browser$")
	public void userLaunchesBrowser() {
		System.out.println("inside method");
		Reporter.addStepLog("Launching browser");
		BrowserInteraction.launchBrowser();
		BrowserInteraction.maximizeWindow();
	}

	@When("^user opens the urlToLaunch$")
	public void userLaunchesURL(String url) {
		Reporter.addStepLog("Opening url "+url);
		BrowserInteraction.launchUrl();
	}
	
	@Then("^user closes browser$")
	public void userClosesBrowser() 
	{
		Reporter.addStepLog("closing Browser");
		BrowserInteraction.userClosesBrowser();
	}
	
	@When("^The url (.*) is launched by user")
	public void userLaunachesUrl(String urlToLaunch) 
	{
		Reporter.addStepLog("Opening url "+urlToLaunch);
		BrowserInteraction.userLaunchesUrl(urlToLaunch);
	}

}
