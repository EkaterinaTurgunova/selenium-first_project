package pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pageobject.helpers.ScreenshotListener;
import pageobject.helpers.WebDriverContainer;

@Listeners(ScreenshotListener.class)

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
//        Browsers browser = Browsers.valueOf(System.getProperty("browser","chrome"));
//        switch (browser) {
//            case chrome: driver = new ChromeDriver(); break;
//            case edge: driver = new EdgeDriver(); break;
//            case firefox: driver = new FirefoxDriver(); break;
//        }
//
//        driver.manage().window().maximize();

        driver = WebDriverContainer.getDriver();
        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void teardown() {
        WebDriverContainer.closeDriver();
    }
}
