@UI_AB
Feature: Validate login functionality for PlateIQ
  I want to use this template for my feature file

  
  Scenario Outline: Verify Order Type Filter
    Given user launches browser 
    When The url <urlToLaunch> is launched by user
    And user Logs in to PlateIQ using <email> and <password>
    Then validate the <WelcomeMessage> with user <username>
    And user closes browser


    Examples:
    |urlToLaunch               |email				|password	|WelcomeMessge			|
    |http://staging.qubiqle.com|binit@plateiq.com	|piqtest123	|Welcome to Plate IQ,	|
    
 @UI_ABC
     Scenario Outline: Verify Order Type Filter
    Given user launches browser 
    When The url <urlToLaunch> is launched by user
    And user Logs in to PlateIQ using <email> and <password>
    Then validate the error message <Error Message>
    And user closes browser


    Examples:
    |urlToLaunch               |email				|password		|Error Messge										|
    |http://staging.qubiqle.com|binit@plateiq.com	|piqtest123223	|Incorrect username or password. Please try again.	|
    

 