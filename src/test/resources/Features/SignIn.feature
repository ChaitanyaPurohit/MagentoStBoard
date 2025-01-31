Feature: Log-In with valid data

Background: 
Given user clicks on Sign In hyperlink


Scenario: Verify user is able to see Sign In hyperlink and click on that
Then the user should navigate to "Customer Login" page 

Scenario: Successfull sign in with valid credentials
When enters valid email id and password
And click on "Sign In" button
Then the user should navigate to "Home Page" page

Scenario: User should not able to sign in without any mandatory params
When user keeps all the fields as empty 
And clicks on "Sign In" button 
Then user should get error message "required field." bellow eaach field

Scenario: User trying to sign in with un-registered email address
When user enteres un-registered email id while signing in
And click on "Sign In" button 
Then user should get error message followed by "The account sign-in was incorrect" in bind "html: $parent.prepareMessageForHtml(message.text)"

Scenario: User trying to sign in with incorrect password
When user enteres incorrect password while signing in
And click on "Sign In" button 
Then user should get error message followed by "The account sign-in was incorrect" in bind "html: $parent.prepareMessageForHtml(message.text)"

Scenario: User should able to see Forget Password hyperlink and click on that
When user clicks on Forgot Your Password? hyperlink
Then the user should navigate to "Forgot Your Password?" page 


