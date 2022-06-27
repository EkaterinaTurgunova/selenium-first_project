package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RubberDuck {

    public static void successTransition(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store1");
    }
}