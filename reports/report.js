$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:basket.feature");
formatter.feature({
  "name": "Adding to basket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding item  to basket from home screen",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_am_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see a grid of items",
  "keyword": "And "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_see_a_grid_of_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover over on and item",
  "keyword": "When "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_hover_over_on_and_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToBasketStepDefs.click_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "That item gets added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToBasketStepDefs.that_item_gets_added_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding a size medium printed dress",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the page for the printed dress",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_am_on_the_page_for_the_printed_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the size to be medium",
  "keyword": "When "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_select_the_size_to_be_medium()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_click_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a size medium printed dress gets added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToBasketStepDefs.a_size_medium_printed_dress_gets_added_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding 3 printed dresses to basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the page for the printed dress",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_am_on_the_page_for_the_printed_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the quantity to 3",
  "keyword": "When "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_change_the_quantity_to(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToBasketStepDefs.i_click_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "3 printed dresses gets added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToBasketStepDefs.printed_dresses_gets_added_to_the_basket(Integer)"
});
formatter.result({
  "status": "passed"
});
});