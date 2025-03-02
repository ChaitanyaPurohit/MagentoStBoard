Feature: User Sign-In

Background: 
Given user clicks on Sign In hyperlink


Scenario: Verify user is able to see Sign In hyperlink and click on that
Then the user should navigate to "Customer Login" page 
@Trial
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
Then user should get allert message followed by "The account sign-in was incorrect" in bind "html: $parent.prepareMessageForHtml(message.text)"

Scenario: User trying to sign in with incorrect password
When user enteres incorrect password while signing in
And click on "Sign In" button 
Then user should get allert message followed by "The account sign-in was incorrect" in bind "html: $parent.prepareMessageForHtml(message.text)"

Scenario: User should able to see Forget Password hyperlink and click on that
When user clicks on Forgot Your Password? hyperlink
Then the user should navigate to "Forgot Your Password?" page 

Scenario: User should able to use forget password functionality with valid email
Given user is on Forgot Your Password? page
When user enters valid email while forgetting password
And click on "Reset My Password" button
Then user should get allert message followed by "If there is an account associated with" in bind "html: $parent.prepareMessageForHtml(message.text)" 

