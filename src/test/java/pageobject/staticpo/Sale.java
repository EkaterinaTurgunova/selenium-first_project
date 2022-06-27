package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Sale {

    public static void successTransition(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "4 | My Store1");
    }
}

