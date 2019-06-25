import com.spartaglobal.cucumberminiproject.SiteLoaders;
import org.junit.Test;
import utilities.DriverUtilities;

public class SiteTest {

    static SiteLoaders site = new SiteLoaders(new DriverUtilities().getDriver());

    @Test
    public void homePage() {
        site.getHomePage().goToHomePage();
    }

    @Test
    public void InputEmail(String email) {
        //site.getHomePage().
    }

    @Test
    public void createAccount(){
        site.getAccountPage().goToAccountPage();
        site.getAccountPage().enterCereateAccountEmail("admin@admin.com");
        site.getAccountPage().clickSignInBTN();

    }
}
