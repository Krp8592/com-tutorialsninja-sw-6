Feature: Top Menu test
  As a user I want to navigate from home page to different pages

  @smoke @regression
  Scenario: User should navigate to desktops page successfully
    Given I am on home page
    When I mouse hover and click on desktop menu
    And I select from dropdown "Show AllDesktops"
    Then I verify navigation to "Desktops" page

  @sanity @regression
  Scenario: User should navigate to Laptop and notebooks successfully
    Given I am on home page
    When I mouse hover and click on Laptop and notebooks menu
    And I select from dropdown of L&N "Show AllLaptops & Notebooks"
    Then I verify navigation to "Laptops & Notebooks" L&N page

  @regression
  Scenario: User should navigate to components page successfully
    Given I am on home page
    When I mouse hover and click on components menu
    And I select from dropdown of coms "Show AllComponents"
    Then I verify navigation to "Components" Coms page

