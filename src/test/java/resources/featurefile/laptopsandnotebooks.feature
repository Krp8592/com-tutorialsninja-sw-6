Feature: Laptops and Notebooks test

  As a user I want to verify that user placed order successfully

  @smoke @regression
  Scenario: Verify products are displayed according to low to high
    Given I am on home page
    When I select currency "£Pound Sterling"
    And I mouse hover and click on Laptop and notebooks menu menu
    And I select from dropdown "Show AllLaptops & Notebooks"
    And I select sort by on option for "Price (High > Low)"
    Then I verify Products displayed according to price low to high

    @sanity @regression
    Scenario: Verify user can place the order successfully
      Given I am on home page
      When I select currency "£Pound Sterling"
      And I mouse hover and click on Laptop and notebooks menu menu
      And I select from dropdown "Show AllLaptops & Notebooks"
      And I select sort by on option for "Price (High > Low)"
      Then I verify Products displayed according to price low to high
      And I select product by name "MacBook"
      Then I verify text on product page
      And I click on add to cart button
      Then I verify success message "Success: You have added MacBook to your shopping cart!"
      And I click on link in message
      Then I verify text on new page "Shopping Cart"
      Then I verify product name on new page "MacBook"
      And I change the quantity "2"
      And I click on quantity update button
      Then I verify modified success message "Success: You have modified your shopping cart!"
      Then I verify cart total "£737.45"


