package com.spartaglobal.cucumberminiproject.stepdefs;
import com.spartaglobal.cucumberminiproject.SiteLoaders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.DriverUtilities;

public class SiteStepDef {


    SiteLoaders sl = new SiteLoaders(DriverUtilities.getInstanceOfDriverUtilities().getDriver());


    //Adding an item on the homepage to basket
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        sl.getHomePage().goToHomePage();
    }

    @And("I see a grid of items")
    public void i_see_a_grid_of_items() {
        sl.getHomePage().hasItems();
    }

    @When("I hover over on and item")
    public void i_hover_over_on_and_item() {
        sl.getHomePage().goToFirstItem();
    }

    @And("Click Add to cart")
    public void click_Add_to_cart() throws InterruptedException {
        sl.getHomePage().clickAddToCart();
    }

    @Then("That item gets added to the cart")
    public void that_item_gets_added_to_the_cart() {
        Assert.assertTrue(sl.getHomePage().getSuccessText().contains("Product successfully added to your shopping cart"));
    }





    //Selecting a size then adding the item to basket
    @Given("I am on the page for the printed dress")
    public void i_am_on_the_page_for_the_printed_dress() {
        sl.getPrintedDressPaged().refresh();
        sl.getPrintedDressPaged().goToPrintedDressPage();
    }

    @When("I select the size to be medium")
    public void i_select_the_size_to_be_medium() {
        sl.getPrintedDressPaged().changeSizeToMedium();
    }

    @And("I click Add to cart")
    public void i_click_Add_to_cart() throws InterruptedException {
        sl.getPrintedDressPaged().AddToCart();
    }

    @Then("a size medium printed dress gets added to the basket")
    public void a_size_medium_printed_dress_gets_added_to_the_basket() {
        Assert.assertTrue(sl.getPrintedDressPaged().getSuccessText().contains("Product successfully added to your shopping cart"));
        Assert.assertEquals('M', sl.getPrintedDressPaged().getSize());
    }



    //Adding multiple of the same item
    @When("I change the quantity to {int}")
    public void i_change_the_quantity_to(Integer quantity) {
        sl.getPrintedDressPaged().setQuantityField();
    }

    @Then("{int} printed dresses gets added to the basket")
    public void printed_dresses_gets_added_to_the_basket(Integer quantity) {
        Assert.assertEquals("4", sl.getPrintedDressPaged().getQuanityInCart());
        sl.getPrintedDressPaged().goToCheckout();
    }

}
