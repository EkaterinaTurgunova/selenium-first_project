package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TermsAndConditions {

    public static void successTransition(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store1");
    }

}