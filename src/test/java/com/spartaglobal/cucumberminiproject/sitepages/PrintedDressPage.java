package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintedDressPage {

    private WebDriver driver;

    // Page Identifiers
    private String printedDressPageUrl = "http://automationpractice.com/index.php?id_product=4&controller=product#/size-s/color-beige";


    // Page objects
    private By dressSize = By.id("group_1");
    private By addToCartButton = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    private By successfullyAdded = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    private By textWithSize = By.id("layer_cart_product_attributes");
    private By quantityField = By.id("quantity_wanted");
    private By quantityInCart= By.id("layer_cart_product_quantity");
    private By proceedToCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");



    public PrintedDressPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void refresh(){
        driver.navigate().refresh();
    }

    public void goToPrintedDressPage(){
        driver.navigate().to(printedDressPageUrl);
    }

    public void changeSizeToMedium(){
        WebElement sizeSelect = driver.findElement(dressSize);
        Select sizeOptionToSelect = new Select(sizeSelect);
        sizeOptionToSelect.selectByVisibleText("M");
    }

    public void setQuantityField(){
        driver.findElement(quantityField).clear();
        driver.findElement(quantityField).sendKeys("3");
    }

    public void AddToCart() throws InterruptedException {
        driver.findElement(addToCartButton).click();
        Thread.sleep(2000);
    }

    public String getSuccessText(){
        return driver.findElement(successfullyAdded).getText();
    }

    public char getSize(){
        String attributes = driver.findElement(textWithSize).getText();
        return attributes.charAt(attributes.length()-1);

    }

    public String getQuanityInCart(){
        return driver.findElement(quantityInCart).getText();
    }

    public void goToCheckout(){
        driver.findElement(proceedToCheckout).click();
    }


}
