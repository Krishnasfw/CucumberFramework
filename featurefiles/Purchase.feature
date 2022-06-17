@Purchase
Feature: Purchase Feature



@Positive
Scenario: Supplier Invoice Number Generation Scenario
Given the user should opens application and navigates to home page
And  the user navigates to Purchases module and click Purchase Order button
When  the user should clicks the create button of Purchase Order module
Then the user should enter the Information and clicks the save button
And the user clicks the Send For Approval button and takes the picture "PurchaseQuotation Number"
And the user clicks the Approve button it generates the Purchase order Number 
And the user takes picture as "PurchaseOrder Number "
And the user clicks the Recieve products and Validate the Invoice it Generate the Supplier Invoice Number
And the user should take the picture as "SupplierInvoice Number" and close the browser


@Negative
Scenario: Without Supplier name user generate SupplierInvoice Number Generation Scenario
Given the user should opens application and navigates to home page
And  the user navigates to Purchases module and click Purchase Order button
When  the user should clicks the create button of Purchase Order module
Then the user without enter the Information and clicks the save button
And the user takes the Negative case picture as "Negative Purchase " and close the browser
