@Customer
Feature: Customer Creation 

@Positive
Scenario: Create the Customer Scenario
Given user open the application and navigates to home page
And user navigates to Sales module and click Customer button
When user click create button
Then user fills the field and clicks the save button
And the user is successfully created the Customer information and take picture "Customer"
And the browser should close

@Negative
Scenario: Create the Customer without Name
Given user open the application and navigates to home page
And user navigates to Sales module and click Customer button
When user click create button
Then user without fills the field and clicks the save button
And take picture "Negative-Customer"
And the browser should close