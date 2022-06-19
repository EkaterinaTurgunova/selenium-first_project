package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GreenDuck {
    private By greenDuskLocator = By.cssSelector(".link[title='Green DucK']");
    private By greenDuckStickerLocator = By.cssSelector(".sticker.new");

    public WebDriver driver;

    public GreenDuck(WebDriver driver) {
        this.driver = driver;
    }
    public void stickerCheck() {
        WebElement greenDuck = driver.findElement(greenDuskLocator);
        WebElement sticker = greenDuck.findElement(greenDuckStickerLocator);
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}
