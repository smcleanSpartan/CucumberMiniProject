package com.spartaglobal.cucumberminiproject.stepdefs;

import com.spartaglobal.cucumberminiproject.SiteLoaders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import utilities.DriverUtilities;


public class SiteStepDef {
    private String email;
    private String password;
    static SiteLoaders site = new SiteLoaders(new DriverUtilities().getDriver());

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        site.getHomePage().goToHomePage();
    }

    @When("I click the SignIn button")
    public void i_click_the_SignIn_button() {
        site.getHomePage().clickSignIn();
    }

    @Then("The accounts page displays")
    public void the_accounts_page_displays() {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",site.getAccountPage().returnCurrentURL());
    }

    @Given("I am on the accounts page")
    public void i_am_on_the_accounts_page() {
        site.getAccountPage().goToAccountPage();
    }

    @And("I am not logged in")
    public void i_am_not_logged_in() {
        if (!site.getAccountPage().returnSignInStatus().equals("Sign in")){
            site.getAccountPage().clickSignOut();
        }
    }

    @And("Email address is registered")
    public void email_address_is_registered() {
        email="amacdougall@spartaglobal.com";
    }

    @And("password matches email address")
    public void password_matches_email_address() {
        password="Sparta2019";
    }

    @When("I enter email")
    public void i_enter_username() {
        site.getAccountPage().enterSignInEmail(email);
    }

    @And("I enter password")
    public void i_enter_password() {
        site.getAccountPage().enterSignInPassword(password);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        site.getAccountPage().clickSignInBTN();
    }

    @Then("The SignIn page displays")
    public void the_SignIn_page_displays() {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account",site.getSignInPage().returnCurrentURL());
    }

    @Then("my status becomes logged in")
    public void my_status_becomes_logged_in() {
        Assert.assertEquals("Angus MacDougall",site.getSignInPage().returnSignInStatus());
    }

    @Given("password does not match email address")
    public void password_does_not_match_email_address() {
        site.getAccountPage().enterSignInPassword("abcdefgh");
    }

    @Then("The authentication page displays")
    public void i_remain_on_the_accounts_page() {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication",site.getAuthenticationPage().returnCurrentURL());
    }

    @Then("my status remains logged out")
    public void my_status_remains_logged_out() {
        Assert.assertEquals("Sign in",site.getAuthenticationPage().returnSignInStatus());
    }

    @And("I recieve error message {string}")
    public void i_receive_error_message(String inputErrMsg) {
        System.out.println(site.getAccountPage().returnErrorMessage());
        Assert.assertEquals(inputErrMsg, site.getAccountPage().returnErrorMessage());
    }

    @Given("password is too short")
    public void password_is_too_short() {
        password="a";
    }

    @Given("Email address is too short")
    public void email_address_is_too_short() {
        email="a";
    }


    //Adding an item on the homepage to basket
    @And("I see a grid of items")
    public void i_see_a_grid_of_items() {
        site.getHomePage().hasItems();
    }

    @When("I hover over on and item")
    public void i_hover_over_on_and_item() {
        site.getHomePage().goToFirstItem();
    }

    @And("Click Add to cart")
    public void click_Add_to_cart() throws InterruptedException {
        site.getHomePage().clickAddToCart();
    }

    @Then("That item gets added to the cart")
    public void that_item_gets_added_to_the_cart() {
        Assert.assertTrue(site.getHomePage().getSuccessText().contains("Product successfully added to your shopping cart"));
    }

    //Adding item from category page to basket
    @Given("I am on the the dresses category page")
    public void i_am_on_the_the_dresses_category_page() {
        site.getDressesCategoryPage().goToDressesCategoryPage();
    }

    @When("I click the Add to cart button under the printed summer dress")
    public void i_click_the_Add_to_cart_button_under_the_printed_summer_dress() throws InterruptedException {
        site.getDressesCategoryPage().clickAddToCart();
    }

    @Then("a printed summer dress gets added to cart")
    public void a_printed_summer_dress_gets_added_to_cart() {
        Assert.assertTrue(site.getPrintedDressPaged().getSuccessText().contains("Product successfully added to your shopping cart"));
    }




    //Selecting a size then adding the item to basket
    @Given("I am on the page for the printed dress")
    public void i_am_on_the_page_for_the_printed_dress() {
        site.getPrintedDressPaged().refresh();
        site.getPrintedDressPaged().goToPrintedDressPage();
    }

    @When("I select the size to be medium")
    public void i_select_the_size_to_be_medium() {
        site.getPrintedDressPaged().changeSizeToMedium();
    }

    @And("I click Add to cart")
    public void i_click_Add_to_cart() throws InterruptedException {
        site.getPrintedDressPaged().AddToCart();
    }

    @Then("a size medium printed dress gets added to the basket")
    public void a_size_medium_printed_dress_gets_added_to_the_basket() {
        Assert.assertTrue(site.getPrintedDressPaged().getSuccessText().contains("Product successfully added to your shopping cart"));
        Assert.assertEquals('M', site.getPrintedDressPaged().getSize());
    }



    //Adding multiple of the same item
    @When("I change the quantity to {int}")
    public void i_change_the_quantity_to(Integer quantity) {
        site.getPrintedDressPaged().setQuantityField();
    }

    @Then("{int} printed dresses gets added to the basket")
    public void printed_dresses_gets_added_to_the_basket(Integer quantity) {
        Assert.assertEquals("4", site.getPrintedDressPaged().getQuanityInCart());
        site.getPrintedDressPaged().goToCheckout();
    }

}
