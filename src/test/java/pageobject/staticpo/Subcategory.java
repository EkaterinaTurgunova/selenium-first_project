package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Subcategory {

    public static void successTransition(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store1");
    }

}
