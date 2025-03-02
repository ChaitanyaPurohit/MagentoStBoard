Feature: category Filtering for Women's Tops page

  Background: User is on the "Women's Top" page
    Given User is on the "Top" page from "Women" category

  Scenario: verify that products under "Jackets" category are diplayed
    When user click on "Category" option from the sidebar
    And user select the "Jackets" category from the sidebar
    Then user should see only products containing "Jackets" in Title

  Scenario: verify that products under "Hoodies & Sweatshirts" category are diplayed
    When user click on "Category" option from the sidebar
    And user select the "Hoodies & Sweatshirts" category from the sidebar
    Then user should see only products containing "Hoodies & Sweatshirts" in Title

  Scenario: verify that products under "Tees" category are diplayed
    When user click on "Category" option from the sidebar
    And user select the "Tees" category from the sidebar
    Then user should see only products containing "Tees" in Title

  Scenario: verify that products under "Bras & Tanks" category are diplayed
    When user click on "Category" option from the sidebar
    And user select the "Bras & Tanks" category from the sidebar
    Then user should see only products containing "Bras & Tanks" in Title

  Scenario: verify the product count matches the category count
    When user click on "Category" option from the sidebar
    And user select the "Jackets" category from the sidebar
    Then User should see the  product count matching the selected "Jackets" category count

  Scenario: verify the product count matches the category count
    When user click on "Category" option from the sidebar
    And user select the "Hoodies & Sweatshirts" category from the sidebar
    Then User should see the  product count matching the selected "Hoodies & Sweatshirts" category count

  Scenario: verify the product count matches the category count
    When user click on "Category" option from the sidebar
    And user select the "Tees" category from the sidebar
    Then User should see the  product count matching the selected "Tees" category count

  Scenario: verify user selecting a size filter
    When user click on "Size" option from the sidebar
    And user select the size "XS"
    Then user should see only product with size "XS" should be displayed

  Scenario: verify clearing size filter
    When user click on "Size" option from the sidebar
    And user select the size "M"
    And user click on clear size filter button
    Then user should see all products displayed again on page

  Scenario: verify User Selecting a color filter
    When user click on "Color" option from the sidebar
    And user select the "Blue" color filter
    Then user should see only products with "Blue" color

 
  Scenario: verify User filtering product by price range
    When user click on "Price" option from the sidebar
    And user select the price range "20-30"
    Then user should see only products within "$20.00" - "$29.99"
 
  Scenario: verify sorting products by price 
    When user click on "Price" option from the sidebar
    And user click on sort By filter
    And user select "Price" option from filter
    Then user should see product sorted in ascending order of price


  Scenario: verify sorting products by price (high to low)
    When user click on "Price" option from the sidebar
    And user click on sort By filter
    And user select "Price" option from filter
    And user select the product by Price "High to Low"
    Then user should see product sorted in descending order of price


  Scenario: verify price filter persistence after page reload
    When user click on "Price" option from the sidebar
    And user select the price range "20-30"
    And user refresh the page
    Then user should see the applied filter "$20.00 - $29.99" remain selected


  Scenario: verify removing price from filter
    When user click on "Price" option from the sidebar
    And user select the price range "20-30"
    And user click on clear size filter button
    Then user should see all products displayed again on page
