package pageobject.fluentinterface;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Sale {

    public WebDriver driver;

    public Sale (WebDriver driver) {
        this.driver = driver;
    }

    public Sale successTransition() {
        Assert.assertEquals(driver.getTitle(), "4 | My Store1");
        return this;
    }
}

