Feature: Women section navigation

  Background: User is on the Home page
    Given User is on the Home page

  Scenario: Verify categories in the Women section
    When User hover on "Women" category
    Then User should able to see the following categories:
      | Subcategory |
      | Tops        |
      | Bottoms     |

  Scenario: Verify subcategories under "Tops"
    When User hover on "Women" category
    And User hover on a "Tops" menu
    Then User should able to see the following categories under a "Tops":
      | Subcategory           |
      | Jackets               |
      | Hoodies & Sweatshirts |
      | Tees                  |
      | Bras & Tanks          |

  @ForSkeleton
  Scenario: Navigate to jacket page under tops
    When User hover on "Women" category
    And User hover on a "Tops" of "Women" category
    And User click on the "Jackets" submenu "Women"
    Then User should able to navigate to the "Jackets" page
    And the page title should be "Jackets"

  Scenario: Verify user navigates to "Tops" page
    When User hover on "Women" menu
    And User click on "Tops" subcategory
    Then User should able to navigate to the "Tops" page
    And the page title should be "Tops"
