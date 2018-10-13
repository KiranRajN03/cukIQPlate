package com.plateIQ.stepdefinition;

import com.plateIQ.stepImplementation.PlateIQLoginStepsImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlateIQ_Login_Steps {

	@When("^user Logs in to PlateIQ using (.*) and (.*)$")
	public void user_Logs_in_to_PlateIQ_using_username_userName_and_password_password(String email, String password){
		PlateIQLoginStepsImpl dl = new PlateIQLoginStepsImpl();
		
		System.out.println(email);
		dl.userLogsInToDimensions(email,password);
	}
	
	@Then("^validate the (.*) with user (.*)$")
	public void validateWelcomeMessage(String welcomeMessage, String username) {
		PlateIQLoginStepsImpl dl = new PlateIQLoginStepsImpl();
		welcomeMessage = welcomeMessage+ username+".";
		try {
		dl.validateWelcomeMessageimpl(welcomeMessage);
		}
		catch(Exception e) {
			
		}
	}
}
