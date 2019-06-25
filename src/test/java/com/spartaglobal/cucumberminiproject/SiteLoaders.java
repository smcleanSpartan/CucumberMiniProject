package com.spartaglobal.cucumberminiproject;

import com.spartaglobal.cucumberminiproject.sitepages.HomePage;
import com.spartaglobal.cucumberminiproject.sitepages.PaymentPage;
import com.spartaglobal.cucumberminiproject.sitepages.ShippingPage;
import com.spartaglobal.cucumberminiproject.sitepages.SummaryPage;
import org.openqa.selenium.WebDriver;

public class SiteLoaders {
    private WebDriver driver;
    private HomePage homePage;
    private PaymentPage paymentPage;
    private SummaryPage summaryPage;
    private ShippingPage shippingPage;

    public SiteLoaders(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        paymentPage = new PaymentPage(driver);
        summaryPage = new SummaryPage(driver);
        shippingPage = new ShippingPage(driver);
    }

    //Pages
    public HomePage getHomePage() {
        return homePage;
    }
    public PaymentPage getPaymentPage(){return paymentPage;}
    public SummaryPage getSummaryPage(){return summaryPage;}
    public ShippingPage getShippingPage(){return shippingPage;}
}

