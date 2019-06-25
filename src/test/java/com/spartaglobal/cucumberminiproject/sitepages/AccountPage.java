package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    private String accountPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By createAccountEmailField = By.id("email_create");
    private By createAccountBTN = By.id("SubmitCreate");
    private By signInEmailField = By.id("email");
    private By signInPasswordField = By.id("passwd");
    private By signInBTN = By.id("SubmitLogin");
    private By createAccountError = By.id("create_account_error");


    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAccountPage(){
        driver.navigate().to(accountPage);
    }

    public void enterCreateAccountEmail(String email){
        driver.findElement(createAccountEmailField).sendKeys(email);
    }

    public String getCreateAccountError() {
        return driver.findElement(createAccountError).getText();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void clickCreateAccountBTN(){
        driver.findElement(createAccountBTN).click();
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

    public WebDriver getDriver() {
        return driver;
    }
}
