package basetests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import drivers.DriverFactory;

public class BaseTest {

    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {

        DriverFactory.initDriver(browser);
    }

    @AfterMethod
    public void teardown() {

        if (DriverFactory.getDriver() != null) {
            DriverFactory.getDriver().quit();
            DriverFactory.unload();
        }
    }
}