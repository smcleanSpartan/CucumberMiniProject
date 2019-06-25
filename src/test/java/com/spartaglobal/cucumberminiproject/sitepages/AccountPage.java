package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    private String accountPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By creatAccountEmailField = By.id("");
    private By creatAccountBTN = By.id("");
    private By signInEmailField = By.id("email");
    //private By signInPasswordField = By.id("psswd");
    private By signInPasswordField = By.xpath("//*[@id=\"passwd\"]");
    private By errorMessage=By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");

    private By signInBTN = By.id("SubmitLogin");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAccountPage(){
        driver.navigate().to(accountPageURL);
    }

    public void enterCereateAccountEmail(String email){
        driver.findElement(creatAccountEmailField).sendKeys(email);
    }

    public void clickCreateAccountBTN(){
        driver.findElement(creatAccountBTN).click();
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

    public String returnErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public String returnCurrentURL(){
        return driver.getCurrentUrl();
    }
}
