package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BlueDuck {
    private By blueDuskLocator = By.cssSelector(".link[title='Blue Duck']");
    private By blueDuckStickerLocator = By.cssSelector(".sticker.new");

    public WebDriver driver;

    public BlueDuck(WebDriver driver) {
        this.driver = driver;
    }
    public void stickerCheck() {
        WebElement blueDuck = driver.findElement(blueDuskLocator);
        WebElement sticker = blueDuck.findElement(blueDuckStickerLocator);
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}

