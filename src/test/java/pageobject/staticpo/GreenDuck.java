package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pageobject.helpers.Locators.getLocator;
import static pageobject.helpers.WebDriverContainer.getDriver;

public class GreenDuck {

    public static void stickerCheck() throws Exception {
        WebElement greenDuck = getDriver().findElement(getLocator("GreenDuck.greenDuskLocator"));
        WebElement sticker = greenDuck.findElement(getLocator("GreenDuck.greenDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}