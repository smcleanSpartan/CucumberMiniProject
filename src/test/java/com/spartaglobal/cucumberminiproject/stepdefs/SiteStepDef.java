package com.spartaglobal.cucumberminiproject.stepdefs;

import com.spartaglobal.cucumberminiproject.SiteLoaders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.DriverUtilities;

public class SiteStepDef {
    static SiteStepDef siteStepDef;

    private static SiteLoaders automationPracticeSite;
    private String email;
    private String password;

    static {
        automationPracticeSite = new SiteLoaders(DriverUtilities.getInstanceOfDriverUtilities().getDriver());
    }


    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        automationPracticeSite.getHomePage().goToHomePage();
    }

    @When("I click the SignIn button")
    public void i_click_the_SignIn_button() {
        automationPracticeSite.getHomePage().clickSignIn();
    }

    @Then("The accounts page displays")
    public void the_accounts_page_displays() {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",automationPracticeSite.getAccountPage().returnCurrentURL());
    }

    @Given("I am on the accounts page")
    public void i_am_on_the_accounts_page() {
        automationPracticeSite.getAccountPage().goToAccountPage();
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
        automationPracticeSite.getAccountPage().enterSignInEmail(email);
    }

    @And("I enter password")
    public void i_enter_password() {
        automationPracticeSite.getAccountPage().enterSignInPassword(password);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        automationPracticeSite.getAccountPage().clickSignInBTN();
    }

    @Then("The SignIn page displays")
    public void the_SignIn_page_displays() {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account",automationPracticeSite.getSignInPage().returnCurrentURL());
    }

    @Then("my status becomes logged in")
    public void my_status_becomes_logged_in() {
        Assert.assertEquals("Angus MacDougall",automationPracticeSite.getSignInPage().returnSignInStatus());
    }

    @Given("password does not match email address")
    public void password_does_not_match_email_address() {
        automationPracticeSite.getAccountPage().enterSignInPassword("abcdefgh");
    }

    @Then("The authentication page displays")
    public void i_remain_on_the_accounts_page() {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication",automationPracticeSite.getAuthenticationPage().returnCurrentURL());
    }

    @Then("my status remains logged out")
    public void my_status_remains_logged_out() {
        Assert.assertEquals("Sign in",automationPracticeSite.getAuthenticationPage().returnSignInStatus());
    }

    @And("I recieve error message {string}")
    public void i_receive_error_message(String inputErrMsg) {
        System.out.println(automationPracticeSite.getAccountPage().returnErrorMessage());
        Assert.assertEquals(inputErrMsg, automationPracticeSite.getAccountPage().returnErrorMessage());
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
        automationPracticeSite.getHomePage().hasItems();
    }

    @When("I hover over on and item")
    public void i_hover_over_on_and_item() {
        automationPracticeSite.getHomePage().goToFirstItem();
    }

    @And("Click Add to cart")
    public void click_Add_to_cart() throws InterruptedException {
        automationPracticeSite.getHomePage().clickAddToCart();
    }

    @Then("That item gets added to the cart")
    public void that_item_gets_added_to_the_cart() {
        Assert.assertTrue(automationPracticeSite.getHomePage().getSuccessText().contains("Product successfully added to your shopping cart"));
    }

    //Selecting a size then adding the item to basket
    @Given("I am on the page for the printed dress")
    public void i_am_on_the_page_for_the_printed_dress() {
        automationPracticeSite.getPrintedDressPaged().refresh();
        automationPracticeSite.getPrintedDressPaged().goToPrintedDressPage();
    }

    @When("I select the size to be medium")
    public void i_select_the_size_to_be_medium() {
        automationPracticeSite.getPrintedDressPaged().changeSizeToMedium();
    }

    @And("I click Add to cart")
    public void i_click_Add_to_cart() throws InterruptedException {
        automationPracticeSite.getPrintedDressPaged().AddToCart();
    }

    @Then("a size medium printed dress gets added to the basket")
    public void a_size_medium_printed_dress_gets_added_to_the_basket() {
        Assert.assertTrue(automationPracticeSite.getPrintedDressPaged().getSuccessText().contains("Product successfully added to your shopping cart"));
        Assert.assertEquals('M', automationPracticeSite.getPrintedDressPaged().getSize());
    }

    //Adding multiple of the same item
    @When("I change the quantity to {int}")
    public void i_change_the_quantity_to(Integer quantity) {
        automationPracticeSite.getPrintedDressPaged().setQuantityField();
    }

    @Then("{int} printed dresses gets added to the basket")
    public void printed_dresses_gets_added_to_the_basket(Integer quantity) {
        Assert.assertEquals("4", automationPracticeSite.getPrintedDressPaged().getQuanityInCart());
    }
    @And("I click go to Checkout")
    public void i_click_go_to_Checkout() {
        automationPracticeSite.getPrintedDressPaged().goToCheckout();
    }

    @Given("I am on the Summary page")
    public void i_am_on_the_Summary_page() throws InterruptedException {
//input one of Rahul's tests to get ot this point
        automationPracticeSite.getHomePage().goToHomePage();
        click_Add_to_cart();
        Thread.sleep(1000);
        i_click_go_to_Checkout();
        //Thread.sleep(1000);
        automationPracticeSite.getSummaryPage().clickProceedToCheckoutButton();
        // wrong username and password


    }
    @And("I am signed in")
    public void i_am_signed_in() throws InterruptedException {
        //sign in here
        /*automationPracticeSite.getSummaryPage().clickProceedToCheckoutButton();
        i_click_the_SignIn_button();*/
        email_address_is_registered();
        password_matches_email_address();
        i_enter_username();
        i_enter_password();
        Thread.sleep(2000);
        i_click_the_SignIn_button();

        email_address_is_registered();
        password_matches_email_address();
        i_enter_username();
        i_enter_password();
        Thread.sleep(2000);
        i_click_the_SignIn_button();

    }

    @And("I input all correct fields until Payment page")
    public void i_input_all_correct_fields_until_Payment_page() {
        automationPracticeSite.getSummaryPage().clickProcessAddressButton();
        automationPracticeSite.getShippingPage().clickTermsCheckBox();
        automationPracticeSite.getShippingPage().clickProceedToCheckoutButton();
    }

    @When("I click the pay by {string}")
    public void i_click_the_pay_by_payment_type(String paymentType) {
        if (paymentType.equals("bank wire")){
            automationPracticeSite.getPaymentPage().clickPayByBankWireButton();
        } else if (paymentType.equals("check")){
            automationPracticeSite.getPaymentPage().clickPayByCheckButton();
        } else {
            System.out.println("Please enter a valid payment method 'check' or 'bank wire'");
        }
    }
    @And("I confirm my order")
    public void i_confirm_my_order() {
        automationPracticeSite.getPaymentPage().clickConfirmMyOrderButton();
    }
    @Then("I receive the message {string}")
    public void i_receive_the_message(String successMessage) {
        Assert.assertEquals(successMessage, automationPracticeSite.getPaymentPage().getSuccessfulPurchaseMessage());
    }
}
