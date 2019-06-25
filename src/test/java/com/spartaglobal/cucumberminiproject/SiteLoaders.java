package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.AccountPage;
import com.spartaglobal.cucumberminiproject.sitepages.AuthenticationPage;
import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import com.spartaglobal.cucumberminiproject.sitepages.PaymentPage;
import com.spartaglobal.cucumberminiproject.sitepages.ShippingPage;
import com.spartaglobal.cucumberminiproject.sitepages.SummaryPage;
import com.spartaglobal.cucumberminiproject.sitepages.PrintedDressPage;
import com.spartaglobal.cucumberminiproject.sitepages.SignInPage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    private HomePage homePage;
    private PaymentPage paymentPage;
    private SummaryPage summaryPage;
    private ShippingPage shippingPage;

    HomePage homePage;
    PrintedDressPage printedDressPaged;
    AccountPage accountPage;
    SignInPage signInPage;
    AuthenticationPage authenticationPage;


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
}

