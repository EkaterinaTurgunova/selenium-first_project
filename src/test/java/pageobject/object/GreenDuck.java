package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pageobject.helpers.Locators.getLocator;

public class GreenDuck {

    public WebDriver driver;

    public GreenDuck(WebDriver driver) {
        this.driver = driver;
    }
    public void stickerCheck() throws Exception {
        WebElement greenDuck = driver.findElement(getLocator("GreenDuck.greenDuskLocator"));
        WebElement sticker = greenDuck.findElement(getLocator("GreenDuck.greenDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}