package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By signInButton=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    // Page Identifiers
    private String homePageUrl = "http://automationpractice.com/index.php";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void goToHomePage(){
        driver.navigate().to(homePageUrl);
    }

    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }

}
