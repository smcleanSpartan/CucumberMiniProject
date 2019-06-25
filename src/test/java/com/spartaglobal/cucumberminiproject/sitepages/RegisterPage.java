package com.spartaglobal.cucumberminiproject.sitepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    private String accountPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    private By titleMr = By.id("id_gender1");
    private By titleMrs = By.id("id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By email = By.id("");
    private By password = By.id("passwd");
    private By dobDrop1 = By.id("days");
    private By dobDrop2 = By.id("months");
    private By dobDrop3 = By.id("years");

    private By addressFirstName = By.id("firstname");
    private By addressLastName = By.id("lastname");
    private By addressLine1 = By.id("address1");
    private By city = By.id("city");
    private By stateDrop = By.id("id_state");
    private By postCode = By.id("postcode");
    private By country = By.id("id_country");
    private By mobilePhone = By.id("phone_mobile");
    private By addressAlias = By.id("alias");
    private By registerBTN = By.id("submitAccount");
    private By registerError = By.className("alert-danger");

    public void setTitle(String title){
        if(title.equalsIgnoreCase("mr")){
            driver.findElement(titleMr).click();
        }else if(title.equalsIgnoreCase("mrs")){
            driver.findElement(titleMrs).click();
        }
    }

    public void setFirstName(String firstName){
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void setPassword(String password){
        driver.findElement(this.password).sendKeys(password);
    }

    public void setDob(int day, int month, int year){
        Select drop1 = new Select(driver.findElement(dobDrop1));
        drop1.selectByValue((String.valueOf(day)));
        Select drop2 = new Select(driver.findElement(dobDrop2));
        drop2.selectByValue((String.valueOf(month)));
        Select drop3 = new Select(driver.findElement(dobDrop3));
        drop3.selectByValue((String.valueOf(year)));
    }

    public void setAddressFirstName(String addressFirstName){
        driver.findElement(this.addressFirstName).sendKeys(addressFirstName);
    }

    public void setAddressLastName(String addressLastName){
        driver.findElement(this.addressLastName).sendKeys(addressLastName);
    }

    public void setAdressLine1(String addressLine1){
        driver.findElement(this.addressLine1).sendKeys(addressLine1);
    }

    public void setCity(String city){
        driver.findElement(this.city).sendKeys(city);
    }

    public void setState(int state){
        Select stateDropBox = new Select(driver.findElement(this.stateDrop));
       stateDropBox.selectByIndex(state);
    }

    public void setPostCode(String postcode){
        driver.findElement(this.postCode).sendKeys(postcode);
    }

    public void setCountry(int country){
        Select countryDrop = new Select(driver.findElement(this.country));
        countryDrop.selectByIndex(country);
    }

    public void setMobileNumber(String number){
        driver.findElement(this.mobilePhone).sendKeys(number);
    }

    public void setAlias(String alias){
        driver.findElement(addressAlias).clear();
        driver.findElement(addressAlias).sendKeys(alias);
    }

    public void clickRegister(){
        driver.findElement(registerBTN).click();
    }

    public boolean isErrorVisible(){
        return driver.findElement(registerError).isDisplayed();
    }

}
