package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.*;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    HomePage homePage;
    PrintedDressPage printedDressPaged;
    AccountPage accountPage;
    SignInPage signInPage;
    AuthenticationPage authenticationPage;
    DressesCategoryPage dressesCategoryPage;


    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        printedDressPaged = new PrintedDressPage(driver);
        accountPage = new AccountPage(driver);
        signInPage = new SignInPage(driver);
        authenticationPage = new AuthenticationPage(driver);
        dressesCategoryPage = new DressesCategoryPage(driver);
    }

    public void tearDown(){
        driver.quit();
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }

    public PrintedDressPage getPrintedDressPaged() {
        return printedDressPaged;
    }

    public AccountPage getAccountPage() {
        return accountPage;
    }

    public SignInPage getSignInPage(){
        return signInPage;
    }

    public AuthenticationPage getAuthenticationPage(){
        return authenticationPage;

    }

    public DressesCategoryPage getDressesCategoryPage(){
        return dressesCategoryPage;
    }
}
