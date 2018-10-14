@UI_test 
Feature: Validate needs attention page of Invoice
	I want to use this template for my feature file

  
Scenario Outline: Verify Order Type Filter 
	Given user launches browser 
	When The url <urlToLaunch> is launched by user 
	And user Logs in to PlateIQ using <email> and <password> 
	Then validate the <WelcomeMessage> with user <username> 
	And click on invoice tab 
	And validate the tabs <tabToValidate> 
	When User clicks on first link of needs Attention 
	Then validate text on the Screen <Screen Value> 
	When user clicks on More <Select Value1>
	And user clicks on Exported  
	Then validate exported text on the screen <Text to validate>
	 And user closes browser
	
	
	Examples: 
	|urlToLaunch               |email				|password	|WelcomeMessge			|tabToValidate															|Screen Value 	|Text to validate	|Select Value			|Select Value1		|
	|http://staging.qubiqle.com|binit@plateiq.com	|piqtest123	|Welcome to Plate IQ,	|Needs Attention,Pending Export,Other Documents,All Documents,Uploads	|Line Items		|Exported			|Mark As not Exported	|Mark As Exported	|	
 