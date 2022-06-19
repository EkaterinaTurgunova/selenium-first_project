package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class YellowDuck {

    private By yellowDuskLocator = By.cssSelector(".link[title='Yellow Duck']");
    private By yellowDuckStickerLocator = By.cssSelector(".sticker.sale");

    public WebDriver driver;

    public YellowDuck(WebDriver driver) {
        this.driver = driver;
    }
    public void stickerCheck() {
       WebElement yellowDuck = driver.findElement(yellowDuskLocator);
       WebElement sticker = yellowDuck.findElement(yellowDuckStickerLocator);
       String stickerText = sticker.getText();

       Assert.assertTrue(stickerText.equalsIgnoreCase("sale"));
    }
}
