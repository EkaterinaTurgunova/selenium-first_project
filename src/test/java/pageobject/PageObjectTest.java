package pageobject;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageobject.object.*;

public class PageObjectTest extends TestBase {

    @Test
    public void siteMenuTest() {

        Actions builder = new Actions(driver);
        SiteMenu siteMenu = new SiteMenu(driver, builder);
        HomePage homePage = new HomePage(driver);
        RubberDuck rubberDuck = new RubberDuck(driver);
        DeliveryInformation deliveryInformation = new DeliveryInformation(driver);
        TermsAndConditions termsAndConditions = new TermsAndConditions(driver);
        Sale sale = new Sale(driver);
        Subcategory subcategory = new Subcategory(driver);

        siteMenu.clickHomePageButton();
        homePage.successTransition();

        siteMenu.clickRubberDuckButton();
        rubberDuck.successTransition();

        siteMenu.clickDeliveryInformationButton();
        deliveryInformation.successTransition();

        siteMenu.clickTermsAndConditionsButton();
        termsAndConditions.successTransition();

        siteMenu.clickSaleButton();
        sale.successTransition();

        siteMenu.clickSubcategoryButton();
        subcategory.successTransition();
    }
    @Test
    public void filterTest() {

        Actions builder = new Actions(driver);
        Filter filter = new Filter(driver);
        SiteMenu siteMenu = new SiteMenu(driver, builder);

        siteMenu.clickSubcategoryButton();

        filter.clickNameButton();
        filter.nameSortCheck();

        filter.clickPriceButton();
        filter.priceSortCheck();
    }

    @Test
    public void yellowDuckStickerTest() {
        YellowDuck yellowDuck = new YellowDuck(driver);
        Actions builder = new Actions(driver);
        SiteMenu siteMenu = new SiteMenu(driver, builder);

        siteMenu.clickSubcategoryButton();
        yellowDuck.stickerCheck();
    }

    @Test
    public void greenDuckStickerTest() {
        GreenDuck greenDuck = new GreenDuck(driver);
        Actions builder = new Actions(driver);
        SiteMenu siteMenu = new SiteMenu(driver, builder);

        siteMenu.clickHomePageButton();
        greenDuck.stickerCheck();
    }

    @Test
    public void blueDuckStickerTest() {
        BlueDuck blueDuck = new BlueDuck(driver);
        Actions builder = new Actions(driver);
        SiteMenu siteMenu = new SiteMenu(driver, builder);

        siteMenu.clickHomePageButton();
        blueDuck.stickerCheck();
    }
}
