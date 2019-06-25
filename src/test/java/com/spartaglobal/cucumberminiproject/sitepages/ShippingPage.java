package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    private WebDriver driver;
    private By termsCheckBox = By.id("cgv");
    private By processCarrier = By.name("processCarrier");




    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTermsCheckBox(){
        driver.findElement(termsCheckBox).click();
    }

    public void clickProceedToCheckoutButton(){
        driver.findElement(processCarrier).click();

    }
}
