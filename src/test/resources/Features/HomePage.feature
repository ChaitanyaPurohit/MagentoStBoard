Feature: Women section navigation

  Background: User is on the Home page
    Given User is on the Home page

  Scenario Outline: Verify categories in the Women section
    When User hover on "Women" category
    Then User should able to see the following menus:
      | Tops    |
      | Bottoms |

  @ForSkeleton
  Scenario Outline: Verify subcategories under "Tops"
    When User hover on "Men" category
    And User hover on a "Tops" of "Men" category
    Then User should able to see the following submenus:
      | Jackets               |
      | Hoodies & Sweatshirts |
      | Tees                  |
      | Tanks                 |

  #Scenario Outline: Verify subcategories under "Tops"
  #When User hover on "Women" category
  #And User hover on a <Bottoms> menu
  #Then User should able to see the following categories under a <Bottoms>:
  #Examples:
  #| Bottoms |
  #| Pants   |
  #| Shorts  |
  
  Scenario: Navigate to jacket page under tops
    When User hover on "Women" category
    And User hover on a "Tops" of "Women" category
    And User click on the "Jackets" submenu "Women"
    Then User should able to navigate to the "Jackets" page
    And the page title should be "Jackets"

  Scenario: Verify user navigates to "Tops" page
    When User hover on "Women" category
    And User click on "Tops" subcategory
    Then User should able to navigate to the "Tops - Women" page
    And the page title should be "Tops - Women"

  Scenario: Verify user navigates to the "Bottoms" page
    When User hover on "Women" category
    And User click on "Bottoms" subcategory
    Then User should able to navigate to the "Bottoms - Women" page
    And the page title should be "Bottoms - Women"
