package pageobject.object;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Sale {

    public WebDriver driver;

    protected Logger LOG = Logger.getLogger(SiteMenu.class);

    public Sale (WebDriver driver) {
        this.driver = driver;
    }

    public void successTransition() {
        LOG.info("Getting Sale Page loaded status");
        Assert.assertEquals(driver.getTitle(), "4 | My Store1");
    }
}

