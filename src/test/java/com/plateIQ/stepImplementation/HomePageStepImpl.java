package com.plateIQ.stepImplementation;

import com.plateIQ.pageObject.HomePage;
import com.plateIQ.utility.BrowserInteraction;

public class HomePageStepImpl {
	public void clickOnInvoice() 
	{
		HomePage homePage = new HomePage(BrowserInteraction.driver);
	
		homePage.clickInvoice();
	}


}
