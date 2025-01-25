Feature: Log-In with valid data

Scenario: Verify user is able to see Sign In hyperlink and click on that
Given the user opens browser and enters valid url
When clicks on Sign In hyperlink
Then the user should navigate to "Customer Login" page 

Scenario: Successfull sign in with valid credentials
Given user is on Sign In page
When enters valid email id and password
And click on sign in button
Then the user should navigate to "Home Page" page

