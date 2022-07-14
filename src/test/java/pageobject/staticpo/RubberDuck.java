package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pageobject.helpers.WebDriverContainer.getDriver;

public class RubberDuck {

    public static void successTransition() {
        Assert.assertEquals(getDriver().getTitle(), "Rubber Ducks | My Store1");
    }
}