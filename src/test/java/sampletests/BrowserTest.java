package sampletests;
import org.testng.annotations.Test;
import driver.DriverFactory;
import basetests.BaseTest;

public class BrowserTest extends BaseTest {
    
    @Test
    public void testGoogle() {

        DriverFactory.getDriver()
                     .get("https://www.google.com");

        System.out.println(
                DriverFactory.getDriver().getTitle());
    }
}