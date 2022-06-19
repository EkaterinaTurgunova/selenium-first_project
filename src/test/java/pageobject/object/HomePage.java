package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    public WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void successTransition() {
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }
}
