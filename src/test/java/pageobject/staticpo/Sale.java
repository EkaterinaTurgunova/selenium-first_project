package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pageobject.helpers.WebDriverContainer.getDriver;

public class Sale {

    public static void successTransition() {
        Assert.assertEquals(getDriver().getTitle(), "4 | My Store1");
    }
}

