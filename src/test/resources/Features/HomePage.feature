Feature: Home Page navigation

  Background: User is on the Home page
    Given User is on the Home page

  Scenario Outline: Verify categories in the Women section
    When User hover on "Women" category
    Then User should able to see the following menus:
      | Tops    |
      | Bottoms |

  Scenario Outline: Verify subcategories under "Tops"
    When User hover on "Women" category
    And User hover on a "Tops" of "Women" category
    Then User should able to see the following submenus:
      | Jackets               |
      | Hoodies & Sweatshirts |
      | Tees                  |
      | Bras & Tanks          |
@Trial
  Scenario Outline: Verify subcategories under "Tops"
    When User hover on "Men" category
    And User hover on a "Tops" of "Men" category
    Then User should able to see the following submenus:
      | Jackets               |
      | Hoodies & Sweatshirts |
      | Tees                  |
      | Tanks                 |

  Scenario Outline: Verify subcategories under "Bottoms"
    When User hover on "Women" category
    And User hover on a "Bottoms" of "Women" category
    Then User should able to see the following submenus:
      | Pants  |
      | Shorts |

  Scenario Outline: Verify subcategories under "Bottoms"
    When User hover on "Men" category
    And User hover on a "Bottoms" of "Men" category
    Then User should able to see the following submenus:
      | Pants  |
      | Shorts |

  Scenario: Navigate to jacket page under "Tops" page
    When User hover on "Women" category
    And User hover on a "Tops" of "Women" category
    And User click on the "Jackets" submenu "Women"
    Then User should able to navigate to the "Home Page" page
    And the page title should be "Home Page"

  Scenario: Verify user navigates to "Tops" page
    When User hover on "Women" category
    And User click on "Tops" subcategory
    Then User should able to navigate to the "Tops - Women" page
    And the page title should be "Tops - Women"


  Scenario: Navigate to jacket page under "Tops" page
    When User hover on "Men" category
    And User hover on a "Tops" of "Men" category
    And User click on the "Jackets" submenu "Men"
    Then User should able to navigate to the "Home Page" page
    And the page title should be "Home Page"
    

  Scenario: Verify user navigates to "Tops" page
    When User hover on "Men" category
    And User click on "Tops" subcategory
    Then User should able to navigate to the "Tops - Men" page
    And the page title should be "Tops - Men"

  Scenario: Verify user navigates to the "Bottoms" page
    When User hover on "Women" category
    And User click on "Bottoms" subcategory
    Then User should able to navigate to the "Bottoms - Women" page
    And the page title should be "Bottoms - Women"

  Scenario: Verify user navigates to the "Bottoms" page
    When User hover on "Men" category
    And User click on "Bottoms" subcategory
    Then User should able to navigate to the "Bottoms - Men" page
    And the page title should be "Bottoms - Men"
