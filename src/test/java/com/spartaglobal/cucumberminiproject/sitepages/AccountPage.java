package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    private String accountPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By createAccountEmailField = By.id("email_create");
    private By createAccountBTN = By.id("SubmitCreate");
    private By signInEmailField = By.id("email");
    private By signInPasswordField = By.id("passwd");
    private By signInBTN = By.id("SubmitLogin");
    private By createAccountError = By.id("create_account_error");
    private By errorMessage=By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
    private By signInStatus=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private By signOut=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAccountPage(){
        driver.navigate().to(accountPageURL);
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

    public void enterSignInEmail(String email){
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void enterSignInPassword(String password){
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickSignInBTN(){
        driver.findElement(signInBTN).click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String returnErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public String returnCurrentURL(){
        return driver.getCurrentUrl();
    }

    public String returnSignInStatus(){
        return driver.findElement(signInStatus).getText();
    }

    public void clickSignOut(){
        driver.findElement(signOut).click();
    }
}
