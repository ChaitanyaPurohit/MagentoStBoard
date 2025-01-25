Feature: Create an account

Scenario: Verify user is able to see Create An Account hyperlink and click on that
Given the user opens browser and enters valid url
When clicks on Create an Account hyperlink
Then the user should navigate to "Create New Customer Account" page

    
Scenario: Successfull account creation with valid credentials
Given the user is on create an account page
When  enters all the required fields with valid parameters
And clicks on Create an Account button
Then the user should navigate to "My Account" page