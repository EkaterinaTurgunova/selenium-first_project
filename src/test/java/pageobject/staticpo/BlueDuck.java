package pageobject.staticpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pageobject.helpers.Locators.getLocator;
import static pageobject.helpers.WebDriverContainer.getDriver;

public class BlueDuck {

    public static void stickerCheck() throws Exception {
        WebElement blueDuck = getDriver().findElement(getLocator("BlueDusk.blueDuckLocator"));
        WebElement sticker = blueDuck.findElement(getLocator("BlueDusk.blueDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}


