package com.plateIQ.stepdefinition;

import com.plateIQ.stepImplementation.PlateIQLoginStepsImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlateIQ_Login_Steps {
	PlateIQLoginStepsImpl dl = new PlateIQLoginStepsImpl();
	@When("^user Logs in to PlateIQ using (.*) and (.*)$")
	public void user_Logs_in_to_PlateIQ_using_username_userName_and_password_password(String email, String password){
		System.out.println(email);
		dl.userLogsInToDimensions(email,password);
	}
	
	@Then("^validate the (.*) with user (.*)$")
	public void validateWelcomeMessage(String welcomeMessage, String username) {
		
		welcomeMessage = welcomeMessage+ username+".";
		try {
		dl.validateWelcomeMessageimpl(welcomeMessage);
		}
		catch(Exception e) {
			
		}
	}
	@Then("^validate the error message (.*)$")
	public void validateErrorMessage(String errorMsg) {
		dl.validationOfErrorMsg(errorMsg);
	}
}
