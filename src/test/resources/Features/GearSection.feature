Feature: Gear section navigation and function

Background: User is on the Gear page
 Given user is on the Gear page

Scenario: Verify categories in the Gear section
 Then user should see the categories "Bags", "Fitness Equipment", and "Watches"

Scenario: Filter products by category
 When user selects the "Bags" category
 Then user should see the list of bags
 And the page should display "14" bags available

 Scenario: Add a product to the cart from the Gear section
 When user selects a product "Affirm Water Bottle"
 And clicks on "Add to Cart" button
 Then the product should be added to the cart

Scenario: Search for a product in the Gear section
 When user searches for "Yoga"
 Then user should see search results related to "Yoga"

Scenario: HomePage link on GearPage should redirect user to home page
When user clicks on Home Page link on gear page
Then the user should navigate to "Home Page" page
  

