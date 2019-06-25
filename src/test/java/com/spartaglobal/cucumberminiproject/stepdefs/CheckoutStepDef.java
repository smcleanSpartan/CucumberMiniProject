package com.spartaglobal.cucumberminiproject.stepdefs;

import com.spartaglobal.cucumberminiproject.SiteLoaders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CheckoutStepDef {
    static SiteLoaders automationPracticeSite;
    static SiteStepDef siteStepDef;

    //automation practice work
    // checkout item
 /*   @Given("I am on the Summary page")
    public void i_am_on_the_Summary_page() throws InterruptedException {
//input one of Rahul's tests to get ot this point
        automationPracticeSite.getHomePage().goToHomePage();
        siteStepDef.click_Add_to_cart();
        siteStepDef.i_click_go_to_Checkout();
    }

    @And("I am signed in")
    public void i_am_signed_in() {
        automationPracticeSite.getSummaryPage().clickProceedToCheckoutButton();
        siteStepDef.i_click_the_SignIn_button();
        siteStepDef.i_enter_username();
        siteStepDef.i_enter_password();
        siteStepDef.i_click_the_SignIn_button();
    }

    @And("I input all correct fields until Payment page")
    public void i_input_all_correct_fields_until_Payment_page() {
        automationPracticeSite.getSummaryPage().clickProceedToCheckoutButton();
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
    }*/
}
