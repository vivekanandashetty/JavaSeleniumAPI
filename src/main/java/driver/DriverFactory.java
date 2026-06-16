package drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    public static void initDriver(String browser) {

    switch(browser.toLowerCase()) {

        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
            break;

        case "edge":
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
            break;

        default:
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
    }
}

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void unload() {
        driver.remove();
    }
}