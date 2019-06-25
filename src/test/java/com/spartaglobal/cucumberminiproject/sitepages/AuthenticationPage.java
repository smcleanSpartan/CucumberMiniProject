package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
    private WebDriver driver;
    private By signInStatus=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String returnCurrentURL(){
        return driver.getCurrentUrl();
    }

    public String returnSignInStatus(){
        return driver.findElement(signInStatus).getText();
    }
}
