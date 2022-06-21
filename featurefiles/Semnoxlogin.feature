@LoginFunction
Feature: Login feature for Semnox Application
#With Scenario Outline keyword
#Use Examples keyword

	@Positive
	Scenario Outline: Vaildlogin scenario 
	Given user is on login page
	When user enter the vaild "<username>" and "<password>"
	And clicks the login button 
	Then user should be navigated to the home page
	And close the browser
	
	Examples:
	|username|password |
	|admin   |admin@321|
	
	@Negative
	Scenario Outline: InValidlogin scenario 
	Given user is on login page
	When user enter the vaild "<username>" and "<password>"
	And clicks the login button 
	Then user should be navigated to the home page
	And close the browser
	
	Examples:
	|username|password |
	|@Dmin   |Admin@!23|