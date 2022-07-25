package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Subcategory {

    private WebDriver driver;

    public Subcategory(WebDriver driver) {
        this.driver = driver;
    }
    public void successTransition() {
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store1");
    }

}
