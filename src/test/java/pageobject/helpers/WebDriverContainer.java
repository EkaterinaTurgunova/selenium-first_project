package pageobject.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.Browsers;


public class WebDriverContainer {

    public static WebDriver driver;

    protected static Logger LOG = Logger.getLogger(WebDriverContainer.class);

    public static WebDriver getDriver() {
        if (driver == null) {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));

            switch (browser) {
                case chrome:
                    LOG.info("Instantiating Chrome driver");
                    driver = new ChromeDriver();
                    break;
                case edge:
                    LOG.info("Instantiating Edge driver");
                    driver = new EdgeDriver();
                    break;
                case firefox:
                    LOG.info("Instantiating Firefox driver");
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();

        }
            return driver;
    }
    public static void closeDriver() {
        LOG.debug("Closing driver");
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}



