package com.spartaglobal.cucumberminiproject.stepdefs;

import com.spartaglobal.cucumberminiproject.SiteLoaders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import utilities.DriverUtilities;


public class SignInPageDefs {
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

}
