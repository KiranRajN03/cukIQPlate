package com.plateIQ.utility;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
	
	
	public static void captureScreenShot(Scenario scenario) 
	{
		if(scenario.isFailed()) 
		{
			Utility.captureScreenShot(BrowserInteraction.driver, scenario);
			Utility.closeBrowser(BrowserInteraction.driver);
		}
		else
		{
			System.out.println("=======DO NOTHING========");
		}
	}
	
	public static void beforeScenario(Scenario scenario) 
	{
		Reporter.addScenarioLog("Executing The Scenario:"+ scenario.getName());
	}
	
	@After
	public static void endBrowserSession()
	{
		BrowserInteraction.userClosesBrowser();
	}

}
