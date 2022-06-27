package pageobject;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageobject.staticpo.*;


public class StaticPOTest extends TestBase {

    @Test
    public static void siteMenuTest() {

        Actions builder = new Actions(driver);

        SiteMenu.clickHomePageButton(driver);
        HomePage.successTransition(driver);

        SiteMenu.clickRubberDuckButton(driver);
        RubberDuck.successTransition(driver);

        SiteMenu.clickDeliveryInformationButton(driver);
        DeliveryInformation.successTransition(driver);

        SiteMenu.clickTermsAndConditionsButton(driver);
        TermsAndConditions.successTransition(driver);

        SiteMenu.clickSaleButton(driver);
        Sale.successTransition(driver);

        SiteMenu.clickSubcategoryButton(driver, builder);
        Subcategory.successTransition(driver);

    }
    @Test
    public static void filterTest() {

        Actions builder = new Actions(driver);

        SiteMenu.clickSubcategoryButton(driver, builder);

        Filter.clickNameButton(driver);
        Filter.nameSortCheck(driver);

        Filter.clickPriceButton(driver);
        Filter.priceSortCheck(driver);
    }
    @Test
    public static void yellowDuckStickerTest() throws Exception {
        Actions builder = new Actions(driver);
        SiteMenu.clickSubcategoryButton(driver,builder);
        YellowDuck.stickerCheck(driver);

    }
    @Test
    public static void greenDuckStickerTest() throws Exception {
        SiteMenu.clickHomePageButton(driver);
        GreenDuck.stickerCheck(driver);
    }
    @Test
    public static void blueDuckStickerTest() throws Exception {
        SiteMenu.clickHomePageButton(driver);
        BlueDuck.stickerCheck(driver);
    }
}


