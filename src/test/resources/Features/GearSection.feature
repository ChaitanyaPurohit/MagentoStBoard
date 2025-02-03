Feature: Gear section navigation and function

Background: User is on the Gear page
    Given User is on the Gear page


  Scenario: Verify categories in the Gear section
    Then User should see the categories "Bags", "Fitness Equipment", and "Watches"

  Scenario: Filter products by category
    When User selects the "Bags" category
    Then User should see the list of bags
    And The page should display "14" bags available

@ForSkeleton
  Scenario: Add a product to the cart from the Gear section
    When User selects a product "Affirm Water Bottle"
    And User clicks "Add to Cart" 
    Then The product should be added to the cart
    And The cart icon should update with the correct item count

  Scenario: Search for a product in the Gear section
    When User searches for "Yoga Mat"
    Then User should see search results related to "Yoga Mat"

  Scenario: Compare two products in the Gear section
    When User selects "Sprite Yoga Companion Kit" for comparison
    And User selects "Fitness Ball" for comparison
    Then The comparison page should display both products