import com.spartaglobal.cucumberminiproject.SiteLoaders;
import org.junit.Test;
import utilities.DriverUtilities;

public class SiteTest {

    static SiteLoaders site = new SiteLoaders(new DriverUtilities().getDriver());

    @Test
    public void debugger() {
        site.getHomePage().goToHomePage();
    }
}
