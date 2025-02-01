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


Scenario: User should not able to create an account without any mandatory params
When user keeps all the fields as empty 
And clicks on "Create an Account" button 
Then user should get error message "required field." bellow eaach field

Scenario: User should not able to create an account with existing email
When user enters existing email while creation of an new account
And clicks on "Create an Account" button
Then user should get allert message followed by "There is already an account with this email address" in bind "html: $parent.prepareMessageForHtml(message.text)"


Scenario: User should not able to create an account with invalid email format
When user enters invalid email format while creation of an new account
And clicks on "Create an Account" button
Then user should get error message as "Please enter a valid email address (Ex: johndoe@domain.com)." in element "email_address-error"


Scenario: User should not able to create an account if confirm password does not matching with password
When user enters different password is both Password
And confirm password field while account creation
And clicks on "Create an Account" button
Then user should get error message as "Please enter the same value again." in element "password-confirmation-error"

Scenario: User enter numbers in firstname and lasname field
When user enters numbers in firstName
And lastname field while account creation
Then the user should not navigate to "My Account" page
