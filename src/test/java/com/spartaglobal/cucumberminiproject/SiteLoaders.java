package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.*;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    private HomePage homePage;
    private PaymentPage paymentPage;
    private SummaryPage summaryPage;
    private ShippingPage shippingPage;
    private PrintedDressPage printedDressPaged;
    private AccountPage accountPage;
    private SignInPage signInPage;
    private AuthenticationPage authenticationPage;


    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        paymentPage = new PaymentPage(driver);
        summaryPage = new SummaryPage(driver);
        shippingPage = new ShippingPage(driver);
        printedDressPaged = new PrintedDressPage(driver);
        accountPage = new AccountPage(driver);
        signInPage = new SignInPage(driver);
        authenticationPage = new AuthenticationPage(driver);
        dressesCategoryPage = new DressesCategoryPage(driver);
    }

    public void tearDown(){
        driver.quit();
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }

    public PaymentPage getPaymentPage(){return paymentPage;}
    public SummaryPage getSummaryPage(){return summaryPage;}
    public ShippingPage getShippingPage(){return shippingPage;}


    public PrintedDressPage getPrintedDressPaged() {
        return printedDressPaged;
    }

    public AccountPage getAccountPage() {
        return accountPage;
    }

    public SignInPage getSignInPage(){
        return signInPage;
    }

    public AuthenticationPage getAuthenticationPage(){
        return authenticationPage;

    }

    public DressesCategoryPage getDressesCategoryPage(){
        return dressesCategoryPage;
    }
}

