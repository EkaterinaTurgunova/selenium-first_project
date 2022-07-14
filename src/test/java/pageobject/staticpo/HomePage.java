package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pageobject.helpers.WebDriverContainer.getDriver;


public class HomePage {

    public static void successTransition() {
        Assert.assertEquals(getDriver().getTitle(), "Online Store | My Store1");
    }
}

