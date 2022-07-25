package pageobject.object;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pageobject.helpers.Locators.getLocator;

public class SiteMenu {

    protected Logger LOG = Logger.getLogger(SiteMenu.class);

    private WebDriver driver;
    private Actions builder;


    public SiteMenu (WebDriver driver,Actions builder) {
        this.driver = driver;
        this.builder = builder;
    }

    public void clickHomePageButton() throws Exception {
        LOG.debug("Clicking Home Page button");
        driver.findElement(getLocator("SiteMenu.homePageLocator")).click();
    }

    public void clickRubberDuckButton() throws Exception {
        LOG.debug("Clicking Rubber Duck button");
        driver.findElement(getLocator("SiteMenu.rubberDuckLocator")).click();
    }

    public void clickDeliveryInformationButton() throws Exception {
        LOG.debug("Clicking Delivery Information button");
        driver.findElement(getLocator("SiteMenu.deliveryInformationLocator")).click();
    }

    public void clickTermsAndConditionsButton() throws Exception {
        LOG.debug("Clicking Terms and Conditions button");
        driver.findElement(getLocator("SiteMenu.termsAndConditionsLocator")).click();
    }

    public void clickSaleButton() throws Exception {
        LOG.debug("Clicking Sale button");
        driver.findElement(getLocator("SiteMenu.saleLocator")).click();
    }
    public void clickSubcategoryButton() throws Exception {
        LOG.debug("Clicking Subcategory button");
        WebElement rubberDuck = driver.findElement(getLocator("SiteMenu.rubberDuckLocator"));
        builder.moveToElement(rubberDuck).perform();
        driver.findElement(getLocator("SiteMenu.subcategoryLocator")).click();
    }
}