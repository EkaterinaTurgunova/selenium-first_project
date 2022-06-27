package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pageobject.helpers.Locators.getLocator;

public class SiteMenu {

    private WebDriver driver;
    private Actions builder;


    public SiteMenu (WebDriver driver,Actions builder) {
        this.driver = driver;
        this.builder = builder;
    }

    public void clickHomePageButton() throws Exception {
        driver.findElement(getLocator("SiteMenu.homePageLocator")).click();
    }

    public void clickRubberDuckButton() throws Exception {
        driver.findElement(getLocator("SiteMenu.rubberDuckLocator")).click();
    }

    public void clickDeliveryInformationButton() throws Exception {
        driver.findElement(getLocator("SiteMenu.deliveryInformationLocator")).click();
    }

    public void clickTermsAndConditionsButton() throws Exception {
        driver.findElement(getLocator("SiteMenu.termsAndConditionsLocator")).click();
    }

    public void clickSaleButton() throws Exception {
        driver.findElement(getLocator("SiteMenu.saleLocator")).click();
    }
    public void clickSubcategoryButton() throws Exception {
        WebElement rubberDuck = driver.findElement(getLocator("SiteMenu.rubberDuckLocator"));
        builder.moveToElement(rubberDuck).perform();
        driver.findElement(getLocator("SiteMenu.subcategoryLocator")).click();
    }
}