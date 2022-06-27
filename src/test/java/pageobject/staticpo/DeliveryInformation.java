package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DeliveryInformation {

    public static void successTransition(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store1");
    }
}

