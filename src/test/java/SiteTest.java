import com.spartaglobal.cucumberminiproject.SiteLoaders;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utilities.DriverUtilities;

public class SiteTest {

    static SiteLoaders site;

    @Before
    public void setUp(){
    site= new SiteLoaders(new DriverUtilities().getDriver());
    }

    @After
    public void tearDown(){
        site.tearDown();
    }

    @Test
    public void homePage() {
        site.getHomePage().goToHomePage();
        site.getPrintedDressPaged().goToPrintedDressPage();
    }


    @Test
    public void createAccount(){
        site.getAccountPage().goToAccountPage();
        site.getAccountPage().enterCereateAccountEmail("admin@admin.com");
        site.getAccountPage().clickSignInBTN();

    }

    @Test
    public void addToBasketFromHomePage() throws InterruptedException {
        site.getHomePage().goToHomePage();
        site.getHomePage().clickAddToCart();
        Assert.assertTrue(site.getHomePage().getSuccessText().contains("Product successfully added to your shopping cart"));
    }

    @Test
    public void changeSizeAndAddToBasket() throws InterruptedException {
        site.getPrintedDressPaged().goToPrintedDressPage();
        site.getPrintedDressPaged().changeSizeToMedium();
        site.getPrintedDressPaged().AddToCart();
        Assert.assertEquals('M', site.getPrintedDressPaged().getSize());

    }
    @Test
    public void addThreeDressesToBasket() throws InterruptedException {
        site.getPrintedDressPaged().goToPrintedDressPage();
        site.getPrintedDressPaged().setQuantityField();
        site.getPrintedDressPaged().AddToCart();
        Assert.assertEquals("3", site.getPrintedDressPaged().getQuanityInCart());
    }
}
