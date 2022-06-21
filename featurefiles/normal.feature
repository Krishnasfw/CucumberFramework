@LoginFunction
Feature: Login feature for Semnox Application

#Without Example keyword
	@Positive
	Scenario: Vaildlogin scenario 
	Given user is on login page
	When user enter the vaild "admin" and "admin@321"
	And clicks the login button 
	Then user should be navigated to the home page
	And close the browser
	
	
	@Negative
	Scenario: InValidlogin scenario 
	Given user is on login page
	When user enter the vaild "@Dmin" and "Admin@!23"
	And clicks the login button 
	Then user should be navigated to the home page
	And close the browser