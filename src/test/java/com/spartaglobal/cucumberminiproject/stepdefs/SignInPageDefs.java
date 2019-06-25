package com.spartaglobal.cucumberminiproject.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SignInPageDefs {

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I click the SignIn button")
    public void i_click_the_SignIn_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("The accounts page displays")
    public void the_accounts_page_displays() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Given("I am on the accounts page")
    public void i_am_on_the_accounts_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("Email address is registered")
    public void email_address_is_registered() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("password matches email address")
    public void password_matches_email_address() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I enter email")
    public void i_enter_username() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I enter password")
    public void i_enter_password() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("The SignIn page displays")
    public void the_SignIn_page_displays() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("my status becomes logged in")
    public void my_status_becomes_logged_in() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("password does not match email address")
    public void password_does_not_match_email_address() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I remain on the accounts page")
    public void i_remain_on_the_accounts_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("my status remains logged out")
    public void my_status_remains_logged_out() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I recieve error message {string}")
    public void i_receive_error_message(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("password is too short")
    public void password_is_too_short() {
        // Write code here that turns the phrase above into concrete actions
    }
}
