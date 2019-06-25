package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    private String accountPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By creatAccountEmailField = By.id("");
    private By creatAccountBTN = By.id("");
    private By signInEmailField = By.id("");
    private By signInPasswordField = By.id("");
    private By signInBTN = By.id("");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAccountPage(){
        driver.navigate().to(accountPage);
    }

    public void enterCereateAccountEmail(String email){
        driver.findElement(creatAccountEmailField).sendKeys(email);
    }

    public void clickCreateAccountBTN(){
        driver.findElement(creatAccountBTN).click();
    }

    public void enterSignInEamil(String email){
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void enterSignInPassowrd(String password){
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickSignInBTN(){
        driver.findElement(signInBTN).click();
    }
}
