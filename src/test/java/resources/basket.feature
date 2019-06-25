Feature: Adding to basket

  Scenario: Adding item  to basket from home screen
    Given I am on the homepage
    And I see a grid of items
    When I hover over on and item
    And Click Add to cart
    Then That item gets added to the cart


  Scenario: Adding a size medium printed dress
    Given I am on the page for the printed dress
    When I select the size to be medium
    And I click Add to cart
    Then a size medium printed dress gets added to the basket


  Scenario: Adding 3 printed dresses to basket
    Given I am on the page for the printed dress
    When I change the quantity to 3
    And I click Add to cart
    Then 3 printed dresses gets added to the basket
    And I click go to Checkout