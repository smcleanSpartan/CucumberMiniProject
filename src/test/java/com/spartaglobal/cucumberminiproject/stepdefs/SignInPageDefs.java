package com.spartaglobal.cucumberminiproject.stepdefs;

import com.spartaglobal.cucumberminiproject.SiteLoaders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverUtilities;

import java.util.Timer;


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

    private String registerURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    private WebDriverWait driverWait = new WebDriverWait(site.getAccountPage().getDriver(), 500);

    @Given("I enter {string}")
    public void i_enter(String email) {
        driverWait.until(ExpectedConditions.urlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account"));
        site.getAccountPage().enterCreateAccountEmail(email);
    }

    @When("I click create account button")
    public void i_click_create_account_button() {
        site.getAccountPage().clickCreateAccountBTN();
    }

    @Then("The register page displays")
    public void the_register_page_displays() {
        driverWait.until(ExpectedConditions.urlToBe(registerURL));
        Assert.assertEquals(registerURL, site.getAccountPage().getCurrentUrl());
    }

    @Given("I am on the register page")
    public void i_am_on_the_register_page() {
        Assert.assertEquals(registerURL, site.getAccountPage().getCurrentUrl());
    }

    @When("I enter all required fields")
    public void i_enter_all_required_fields() {
        site.getRegisterPage().setTitle("Mr");
        site.getRegisterPage().setFirstName("Dave");
        site.getRegisterPage().setLastName("Jones");
        site.getRegisterPage().setPassword("flint09");
        site.getRegisterPage().setDob(07, 02, 1989);
        site.getRegisterPage().setAddressFirstName("Dave");
        site.getRegisterPage().setAddressLastName("Jones");
        site.getRegisterPage().setAdressLine1("1 Floobart Street");
        site.getRegisterPage().setCity("London");
        site.getRegisterPage().setState(4);
        site.getRegisterPage().setPostCode("N22 8SG");
        site.getRegisterPage().setCountry(1);
        site.getRegisterPage().setMobileNumber("07983640306");
        site.getRegisterPage().setAlias("MyAddress");

    }

    @When("I click register button")
    public void i_click_register_button() {
        site.getRegisterPage().clickRegister();
    }

    @Then("I recieve account created message")
    public void i_recieve_account_created_message() {

        Assert.assertTrue(site.getRegisterPage().isErrorVisible());

    }


}
