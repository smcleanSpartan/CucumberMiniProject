Feature: Create account
  as a new user to the site.

  Scenario: Navigating to accounts page
    Given I am on the homepage
    When I click the SignIn button
    Then The accounts page displays

  Scenario: Validate email
    Given I enter "tim@admin.com"
    When I click create account button
    Then The register page displays

Scenario: Register as new user
  Given I am on the register page
  When I enter all required fields
  And I click register button
  Then I recieve account created message