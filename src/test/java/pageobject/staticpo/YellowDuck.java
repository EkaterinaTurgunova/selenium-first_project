package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pageobject.helpers.Locators.getLocator;
import static pageobject.helpers.WebDriverContainer.getDriver;


public class YellowDuck {

    public static void stickerCheck() throws Exception {
        WebElement yellowDuck = getDriver().findElement(getLocator("YellowDuck.yellowDuskLocator"));
        WebElement sticker = yellowDuck.findElement(getLocator("YellowDuck.yellowDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("sale"));
    }
}
