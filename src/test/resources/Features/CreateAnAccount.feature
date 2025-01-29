Feature: User Registration

Background: Open create an account hyperlink
Given the user is on create an account page

Scenario: Verify user is able to see Create An Account hyperlink and click on that
When clicks on Create an Account hyperlink
Then the user should navigate to "Create New Customer Account" page

    
Scenario: Successfull account creation with valid credentials
When  enters all the required fields with valid parameters
And clicks on "Create an Account" button
Then the user should navigate to "My Account" page


Scenario: User should not able to create an account without mandatory params
When user keeps all the fields as empty 
And clicks on "Create an Account" button 
Then user should get error message "required field." bellow eaach field

