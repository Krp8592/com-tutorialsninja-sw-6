Feature: Account Register Test

  As a user I want to register on the website successfully

  @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on my account tab
    And I select my account option "Register"
    Then I verify "Register Account" text successfully

  @sanity @regression
  Scenario: User should login and logout successfully
    Given I am on home page
    When I click on my account tab
    And I select my account option "Register"
    And I enter first name
    And I enter last name
    And I enter new email address
    And I enter telephone number "07733992255"
    And I enter password on register page "Asdf1234!"
    And I enter confirm password on register page "Asdf1234!"
    And I select subscription "Yes"
    And I click on privacy check box
    And I click on continue button
    Then I verify account created message "Your Account Has Been Created!"
    And I click on my account tab
    And I select my account option "Logout"
    Then I verify account logout text "Account Logout"
    And I click on continue button after
