package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pageobject.helpers.WebDriverContainer.getDriver;

public class Subcategory {

    public static void successTransition() {
        Assert.assertEquals(getDriver().getTitle(), "Subcategory | My Store1");
    }

}
