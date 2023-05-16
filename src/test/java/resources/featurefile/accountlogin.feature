Feature: Account login test

  As a user I want to login to the website

  @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on my account tab
    And I select my account option from the dropdown "Login"
    Then I verify text on login page "Returning Customer"

    @sanity @regression
      Scenario: User should login and logout successfully
      Given I am on home page
      When click on my account tab
      And I select my account option from the dropdown "Login"
      And I enter email address "admin123456@gmail.com"
      And I enter password "Admin@123"
      And I click on Login button
      And I click on my account tab
      And I select my account option "Logout"
      Then I verify "Account Logout" text message