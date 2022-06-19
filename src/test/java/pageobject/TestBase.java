package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    static WebDriver driver;

    @BeforeMethod
    public void setup() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser","chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case edge: driver = new EdgeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }

        driver.manage().window().maximize();

        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
