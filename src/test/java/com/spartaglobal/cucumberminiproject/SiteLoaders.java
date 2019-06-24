package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    HomePage homePage;

    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }
}
