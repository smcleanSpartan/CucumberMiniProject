package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DressesCategoryPage {
    private WebDriver driver;

    // Page Identifiers
    private String dressesCategoryPageUrl = "http://automationpractice.com/index.php?id_category=8&controller=category";


    // Page objects
    private By addItemToCart3 = By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span");
    private By successfullyadded = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");


    public DressesCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void goToDressesCategoryPage(){
        driver.navigate().to(dressesCategoryPageUrl);
    }

    public void clickAddToCart() throws InterruptedException {
        driver.findElement(addItemToCart3).click();
        Thread.sleep(2000);
    }

    public String getSuccessText(){
        return driver.findElement(successfullyadded).getText();
    }

}
