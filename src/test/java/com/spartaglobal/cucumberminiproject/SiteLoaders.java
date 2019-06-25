package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.AccountPage;
import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import com.spartaglobal.cucumberminiproject.sitepages.RegisterPage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    HomePage homePage;
    AccountPage accountPage;
    RegisterPage registerPage;

    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
        registerPage = new RegisterPage(driver);
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }

    public AccountPage getAccountPage() {
        return accountPage;
    }

    public RegisterPage getRegisterPage(){
        return registerPage;
    }
}
