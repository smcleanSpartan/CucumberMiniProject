package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import com.spartaglobal.cucumberminiproject.sitepages.PrintedDressPage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    HomePage homePage;
    PrintedDressPage printedDressPaged;


    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        printedDressPaged = new PrintedDressPage(driver);
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }
    public PrintedDressPage getPrintedDressPaged(){
        return printedDressPaged;
    }
}
