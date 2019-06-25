package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage {
    private WebDriver driver;
    private By processAddressButton = By.name("processAddress");
    private By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    private String summaryPageUrl = "http://automationpractice.com/index.php";


    public SummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSummaryPage(){
        driver.navigate().to(summaryPageUrl);
    }

    public void goToSignInPage(){
        //input angus's test
    }

    public void clickProcessAddressButton(){
        driver.findElement(processAddressButton).click();
    }

    public void clickProceedToCheckoutButton(){
        driver.findElement(proceedToCheckoutButton).click();
    }

}
