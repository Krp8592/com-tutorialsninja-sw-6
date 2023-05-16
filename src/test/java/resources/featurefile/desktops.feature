Feature: Desktop test

  As a user I want to enter a product into shopping cart successfully

  @smoke @regression
  Scenario: products should arrange in alphabetical order
    Given I am on home page
    When I select currency "£Pound Sterling"
    And I mouse hover and click on desktop menu
    And I select from dropdown "Show AllDesktops"
    And I select sort by option "Name (Z - A)"
    Then I verify Products sorted in reverse alphabetical order

    @sanity @regression
      Scenario: user should be able to add product in shopping cart
      Given I am on home page
      When I select currency "£Pound Sterling"
      And I mouse hover and click on desktop menu
      And I select from dropdown "Show AllDesktops"
      And I select sort by option "Name (A - Z)"
      And I select product by name "HP LP3065"
      Then I verify product text "HP LP3065"
      And I select delivery date "30" month "November" year "2023"
      And I enter quantity "1"
      And I click on continue button on product page
      Then I verify success message "Success: You have added HP LP3065 to your shopping cart!"
      And I click on shopping cart link displayed in the message
      Then I verify the total cart text "Shopping Cart"
      Then I verify the product name text "HP LP3065"
      Then I verify the delivery date text "2023-11-30"
      Then I verify the model text "Product 21"
      Then I verify the total cart text "£74.73"