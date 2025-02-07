Feature: Women section navigation

Background: User is on the Home page
    Given User is on the Home page
    
    
    Scenario: Verify categories in the Women section
    When User hover on "Women" menu 
    Then User should able to see the following categories:
    |Subcategory|
    | Tops |
    | Bottoms |
    
    Scenario: Verify subcategories under "Tops"
    When User hover on "Women" menu
    And User hover on "Tops" subcategory
    Then User should able to see the following categories under the "Tops":
    |Subcategory|
    |Jackets|
    |Hoodies & Sweatshirts|
    |Tees|
    |Bras & Tanks|
    
    Scenario: Navigate to "Jackets" page under "Tops"
    When User hover on "Women" menu
    And User hover on "Tops" subcategory
    And User click on "Jackets" subcategory
    Then User should able to navigate to the "Jackets" page
    And the page title should be "Jackets"
    
    Scenario: Navigate to "Hoodies & Sweatshirts" page under "Tops"
    When User hover on "Women" menu
    And User hover on "Tops" subcategory
    And User click on "Hoodies & Sweatshirts" subcategory
    Then User should able to navigate to the "Hoodies & Sweatshirts" page
    And the page title should be "Hoodies & Sweatshirts"
    
    Scenario: Navigate to "Tees" page under "Tops"
    When User hover on "Women" menu
    And User hover on "Tops" subcategory
    And User click on "Tees" subcategory
    Then User should able to navigate to the "Tees" page
    And the page title should be "Tees"
    
    Scenario: Navigate to "Bras & Tanks" page under "Tops"
    When User hover on "Women" menu
    And User hover on "Tops" subcategory
    And User click on "Bras & Tanks" subcategory
    Then User should able to navigate to the "Bras & Tanks" page
    And the page title should be "Bras & Tanks"
    
    Scenario: Verify subcategories under "Bottoms"
    When User hover on "Women" menu
    And User hover on "Bottoms" subcategory
    Then User should able to see the following categories under the "Bottoms":
    |Pants|
    |Shorts|
    
    
    Scenario: Verify user navigates to "Tops" page
    When User hover on "Women" menu
    And User click on "Tops" subcategory
    Then User should able to navigate to the "Tops" page
    And the page title should be "Tops"
    
     Scenario: Verify user navigates to "Bottoms" page
    When User hover on "Women" menu
    And User click on "Bottoms" subcategory
    Then User should able to navigate to the "Bottoms" page
    And the page title should be "Bottoms"
    
    
    
    
    
    
    
    
   
    
