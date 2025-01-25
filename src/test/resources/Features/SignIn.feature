Feature: Log-In with valid data

Background: 
Given user clicks on Sign In hyperlink


Scenario: Verify user is able to see Sign In hyperlink and click on that
Then the user should navigate to "Customer Login" page 

Scenario: Successfull sign in with valid credentials
When enters valid email id and password
And click on sign in button
Then the user should navigate to "Home Page" page

