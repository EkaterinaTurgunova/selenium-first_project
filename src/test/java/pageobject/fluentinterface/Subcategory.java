package pageobject.fluentinterface;
//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Subcategory {

    private WebDriver driver;

    public Subcategory(WebDriver driver) {
        this.driver = driver;
    }

    public Subcategory successTransition() {
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store1");
        return this;
    }

}
