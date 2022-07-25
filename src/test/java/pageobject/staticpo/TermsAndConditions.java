package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pageobject.helpers.WebDriverContainer.getDriver;

public class TermsAndConditions {

    public static void successTransition() {
        Assert.assertEquals(getDriver().getTitle(), "Terms & Conditions | My Store1");
    }

}