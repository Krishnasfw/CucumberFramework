Feature: This is the login feature for Semnox Application
Scenario: Semnox Application login scenario 
	Given user is on login page
	When user enter the vaild username and password
	And clicks the login button 
	Then user should be navigated to the home page
	And close the browser