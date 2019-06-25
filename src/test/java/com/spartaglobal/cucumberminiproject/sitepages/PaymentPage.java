package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private WebDriver driver;
    private By payByBankWireField = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    private By payByCheckField = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
    private By confirmMyOrder = By.xpath("//*[@id=\"cart_navigation\"]/button");
    private By orderCompleteMessage = By.className("dark");


    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void goToPaymentPage(){
    }
    public void clickPayByBankWireButton(){
        driver.findElement(payByBankWireField).click();
    }
    public void clickPayByCheckButton(){
        driver.findElement(payByCheckField).click();
    }
    public void clickConfirmMyOrderButton(){
        driver.findElement(confirmMyOrder).click();
    }
    public String getSuccessfulPurchaseMessage(){
        return driver.findElement(orderCompleteMessage).getText();
    }
}
