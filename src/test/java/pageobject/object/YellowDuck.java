package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pageobject.helpers.Locators.getLocator;


public class YellowDuck {

    public WebDriver driver;

    public YellowDuck(WebDriver driver) {
        this.driver = driver;
    }
    public void stickerCheck() throws Exception {
        WebElement yellowDuck = driver.findElement(getLocator("YellowDuck.yellowDuskLocator"));
        WebElement sticker = yellowDuck.findElement(getLocator("YellowDuck.yellowDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("sale"));
    }
}
