package sampletests;
import org.testng.annotations.Test;
import drivers.DriverFactory;
import basetests.BaseTest;

public class BrowserTestParameter extends BaseTest {
    
    @Test
    public void testGoogle() {

        DriverFactory.getDriver()
                     .get("https://www.firefox.com");

        System.out.println(
                DriverFactory.getDriver().getTitle());
    }
}