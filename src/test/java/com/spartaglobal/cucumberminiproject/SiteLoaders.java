package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.AccountPage;
import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    HomePage homePage;
    AccountPage accountPage;

    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }

    public AccountPage getAccountPage() {
        return accountPage;
    }
}
