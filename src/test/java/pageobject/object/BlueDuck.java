package pageobject.object;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobject.TestBase;

import static pageobject.helpers.Locators.getLocator;

public class BlueDuck extends TestBase {

    public WebDriver driver;

    protected Logger LOG = Logger.getLogger(SiteMenu.class);

    public BlueDuck(WebDriver driver) {
        this.driver = driver;
    }

    public void stickerCheck() throws Exception {
        LOG.debug("Checking sticker");
        WebElement blueDuck = driver.findElement(getLocator("BlueDusk.blueDuckLocator"));
        WebElement sticker = blueDuck.findElement(getLocator("BlueDusk.blueDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}


