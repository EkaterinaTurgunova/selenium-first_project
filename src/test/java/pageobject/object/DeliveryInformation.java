package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DeliveryInformation {

    public WebDriver driver;

    public DeliveryInformation (WebDriver driver) {
        this.driver = driver;
    }

    public void successTransition() {
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store1");
    }
}

