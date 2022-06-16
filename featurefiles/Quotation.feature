@Quotation 
Feature: Quotation  feature
Scenario: Quotation Number Generation Secnario

Given the user opens application and navigates to home page
And  the user navigates to Sales module and click Quotation button
When  the user click create button
Then the user fills the field and clicks the save button
And user click the Send for Approval button for generating Quotation number 
Then Quotation Number is generated and user take picture "Quotation Number"
Then user click the Approve button to generate the Sale order number
And user takes picture "SaleOrder Number"
Then user click create Invoice button and fill the mandatory fields 
Then user should click save button and validate button
And Invoice number is generated and user take picture "Invoice Number"