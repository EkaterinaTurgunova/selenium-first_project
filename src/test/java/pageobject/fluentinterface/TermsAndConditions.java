package pageobject.fluentinterface;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TermsAndConditions {

    public WebDriver driver;

    public TermsAndConditions (WebDriver driver) {
        this.driver = driver;
    }

    public TermsAndConditions successTransition() {
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store1");
        return this;
    }

}