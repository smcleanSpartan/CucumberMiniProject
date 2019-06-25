package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.AccountPage;
import com.spartaglobal.cucumberminiproject.sitepages.AuthenticationPage;
import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import com.spartaglobal.cucumberminiproject.sitepages.RegisterPage;
import com.spartaglobal.cucumberminiproject.sitepages.SignInPage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    HomePage homePage;
    AccountPage accountPage;
    RegisterPage registerPage;

    SignInPage signInPage;
    AuthenticationPage authenticationPage;

    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
        registerPage = new RegisterPage(driver);

        signInPage = new SignInPage(driver);
        authenticationPage = new AuthenticationPage(driver);
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }

    public AccountPage getAccountPage() {
        return accountPage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public SignInPage getSignInPage(){
        return signInPage;
    }

    public AuthenticationPage getAuthenticationPage(){
        return authenticationPage;
    }

}
