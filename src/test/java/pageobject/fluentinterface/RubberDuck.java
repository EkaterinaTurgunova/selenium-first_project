package pageobject.fluentinterface;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RubberDuck {

    public WebDriver driver;

    public RubberDuck (WebDriver driver) {
        this.driver = driver;
    }

    public RubberDuck successTransition() {
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store1");
        return this;
    }
}