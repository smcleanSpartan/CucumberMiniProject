import com.spartaglobal.cucumberminiproject.SiteLoaders;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverUtilities;

public class SiteTest {

    static SiteLoaders site = new SiteLoaders(new DriverUtilities().getDriver());
    WebDriverWait driverWait = new WebDriverWait(site.getAccountPage().getDriver(), 500);

    @Test
    public void homePage() {
        site.getHomePage().goToHomePage();
    }

    @Test
    public void createAccountError(){
        site.getAccountPage().goToAccountPage();
        site.getAccountPage().enterCreateAccountEmail("admin'admin.com");
        site.getAccountPage().clickCreateAccountBTN();

        driverWait.until(ExpectedConditions.visibilityOf(site.getAccountPage().getDriver()
                .findElement(By.id("create_account_error"))));

        String error = site.getAccountPage().getCreateAccountError();
        Assert.assertEquals("Invalid email address.", error);
    }

    @Test
    public void createAccountExistingEmailError(){
        site.getAccountPage().goToAccountPage();
        site.getAccountPage().enterCreateAccountEmail("admin@admin.com");
        site.getAccountPage().clickCreateAccountBTN();

        driverWait.until(ExpectedConditions.visibilityOf(site.getAccountPage().getDriver()
                .findElement(By.id("create_account_error"))));

        String error = site.getAccountPage().getCreateAccountError();
        String expected = "An account using this email address has already been registered. " +
                "Please enter a valid password or request a new one.";

        Assert.assertEquals(expected, error);
    }



    @Test
    public void createAccount(){
        site.getAccountPage().goToAccountPage();
        site.getAccountPage().enterCreateAccountEmail("admin@admin1.com");
        site.getAccountPage().clickCreateAccountBTN();

        String expected = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

        driverWait.until(ExpectedConditions.urlToBe(expected));

        Assert.assertEquals(expected, site.getAccountPage().getCurrentUrl());

        site.getRegisterPage().setTitle("Mr");
        site.getRegisterPage().setFirstName("Dave");
        site.getRegisterPage().setLastName("Jones");
        site.getRegisterPage().setPassword("flint09");
        site.getRegisterPage().setDob(07, 02, 1989);
        site.getRegisterPage().setAddressFirstName("Dave");
        site.getRegisterPage().setAddressLastName("Jones");
        site.getRegisterPage().setAdressLine1("1 Floobart Street");
        site.getRegisterPage().setCity("London");
        site.getRegisterPage().setState(4);
        site.getRegisterPage().setPostCode("N22 8SG");
        site.getRegisterPage().setCountry(1);
        site.getRegisterPage().setMobileNumber("07983640306");
        site.getRegisterPage().setAlias("MyAddress");
        site.getRegisterPage().clickRegister();

    }

}
