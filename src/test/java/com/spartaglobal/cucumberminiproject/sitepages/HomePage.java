package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Page Identifiers
    private String homePageUrl = "http://automationpractice.com/index.php";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void goToHomePage(){
        driver.navigate().to(homePageUrl);
    }

}
