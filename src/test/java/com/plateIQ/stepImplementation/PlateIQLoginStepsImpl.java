package com.plateIQ.stepImplementation;

import com.plateIQ.pageObject.PlateIQLoginPage;
import com.plateIQ.utility.BrowserInteraction;
import com.plateIQ.utility.FileConfig;

public class PlateIQLoginStepsImpl {

		
		
		//public static String userName = FileConfig.getProperty("DimensionUser");
		//public static String password = FileConfig.getProperty("DimensionPassword");
		
		public void userLogsInToDimensions(String email, String password) 
		{
			PlateIQLoginPage loginPage = new PlateIQLoginPage(BrowserInteraction.driver);
			loginPage.enterUserName(email);
			loginPage.enterPassword(password);
			loginPage.clickOk();
		}
		public void validateWelcomeMessageimpl(String welcomeMessage) throws InterruptedException
		{
			PlateIQLoginPage loginPage = new PlateIQLoginPage(BrowserInteraction.driver);
			loginPage.validateWelcomeMessage(welcomeMessage);
			
		}

	}
