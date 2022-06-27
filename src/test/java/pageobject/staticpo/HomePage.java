package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage {

    public static void successTransition(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }
}

