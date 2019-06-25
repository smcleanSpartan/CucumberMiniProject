Feature: Automation Practice Checkout
  As a user of the automation practice site
  I want to buy an item

  Scenario: I can buy an item by payment type
    Given I am on the Summary page
    And I am signed in
    And I input all correct fields until Payment page
    When I click the pay by "bank wire"
    And I confirm my order
    Then I receive the message "Your order on My Store is complete."
