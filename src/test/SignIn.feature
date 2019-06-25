Feature: Sign In
  as a user of the site
  I want to sign in to my account

Scenario: Navigating to accounts page
  Given I am on the homepage
  When I click the SignIn button
  Then The accounts page displays

  Scenario: Successful login
    Given I am on the accounts page
    And Email address is registered
    And password matches email address
    When I enter email
    And I enter password
    And I click the login button
    Then The SignIn page displays
    And my status becomes logged in

  Scenario: Incorrect password
    Given I am on the accounts page
    And Email address is registered
    And password does not match email address
    When I enter email
    And I enter password
    And I click the login button
    Then I remain on the accounts page
    And my status remains logged out
    And I recieve error message "Authentication Failed"

  Scenario: Invalid password
    Given I am on the accounts page
    And Email address is registered
    And password is too short
    When I enter email
    And I enter password
    And I click the login button
    Then I remain on the accounts page
    And my status remains logged out
    And I recieve error message "Invalid Password"

  Scenario: Invalid email
    Given I am on the accounts page
    And Email address is too short
    And password matches email address
    When I enter email
    And I enter password
    And I click the login button
    Then I remain on the accounts page
    And my status remains logged out
    And I recieve error message "Invalid Email Address"