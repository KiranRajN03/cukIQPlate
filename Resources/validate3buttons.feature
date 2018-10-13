@UI_test
Feature: Validate login functionality for PlateIQ
  I want to use this template for my feature file

  
  Scenario Outline: Verify Order Type Filter
    Given user launches browser 
    When The url <urlToLaunch> is launched by user
    And user Logs in to PlateIQ using <email> and <password>
    Then validate the <WelcomeMessage> with user <username>
     And click on invoice tab 
     And validate the tabs <tabToValidate>


    Examples:
    |urlToLaunch               |email				|password	|WelcomeMessge			|tabToValidate|
    |http://staging.qubiqle.com|binit@plateiq.com	|piqtest123	|Welcome to Plate IQ,	|Needs Attention,Pending Export,Other Documents,All Documents,Uploads|

 