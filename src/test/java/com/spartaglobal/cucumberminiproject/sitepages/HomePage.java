
package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    private By signInButton=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    // Page Identifiers
    private String homePageUrl = "http://automationpractice.com/index.php";


    // Page objects
    private By mostPopular = By.id("homefeatured");
    private By bestSellers = By.id("blockbestsellers");
    private By addItemToCart1 = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
    private By successfullyadded = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    private By firstItem = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void goToHomePage(){
        driver.navigate().to(homePageUrl);
    }


    public boolean hasItems(){
        if(driver.findElement(mostPopular).isDisplayed()||driver.findElement(bestSellers).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }

    public void goToFirstItem(){
        Actions move = new Actions(driver);
        Action action = move.moveToElement(driver.findElement(firstItem)).build();
        action.perform();

    }

    public void clickAddToCart() throws InterruptedException {
        driver.findElement(addItemToCart1).click();
        Thread.sleep(2000);
    }

    public String getSuccessText(){
        return driver.findElement(successfullyadded).getText();
    }



    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }

}
