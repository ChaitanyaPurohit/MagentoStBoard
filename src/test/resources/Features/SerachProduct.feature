@Trial
Feature: Search Product Functionality

 Background: User is on  Home page
    Given User is on Home page
   
  Scenario: Verify valid product search
    When User enters a valid product name "Yoga Pant" in the search box
    And User clicks on the search button
    Then User should see the product "Yoga Pant" in the search results
  
  Scenario: Verify search with an invalid product
    When User enters an invalid product name "XYZ123" in the search box
    And User clicks on the search button
    Then User should see a message "Your search returned no results."
    
  Scenario: Verify search with a partial product name
    When User enters a partial product name "Yoga" in the search box
    And User clicks on the search button
    Then User should see products related to "Yoga"
  
  Scenario: Verify search with special characters
    When User enters special characters "@#$%" in the search box
    And User clicks on the search button
    Then User should see a message "Your search returned no results."
  
  Scenario: Verify search with numbers
    When User enters a numeric value "12345" in the search box
    And User clicks on the search button
    Then User should see a message "Your search returned no results."
 
  Scenario: Verify that search button is disabled when search input is empty
    When User does not enter any Text in SearchBox
    Then The search button should be disabled

  Scenario: Verify auto-suggestion in search
    When User starts typing "Yoga" in the search box
    Then User should see an auto-suggestion list with relevant products

  Scenario: Verify clicking on a suggested product
    When User starts typing "Yoga" in the search box
    And User clicks on a suggested product "Yoga Pant"
    Then User should be navigated to the product details page of "Home Page"

    Scenario: Verify search functionality with case sensitivity
    When User enters "yoga pant" in lowercase in the search box
    And User clicks on the search button
    Then User should see the same results as "Yoga Pant"