package pageobject;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageobject.staticpo.*;


public class StaticPOTest extends TestBase {

    @Test
    public static void siteMenuTest() {

        Actions builder = new Actions(driver);

        SiteMenu.clickHomePageButton();
        HomePage.successTransition();

        SiteMenu.clickRubberDuckButton();
        RubberDuck.successTransition();

        SiteMenu.clickDeliveryInformationButton();
        DeliveryInformation.successTransition();

        SiteMenu.clickTermsAndConditionsButton();
        TermsAndConditions.successTransition();

        SiteMenu.clickSaleButton();
        Sale.successTransition();

        SiteMenu.clickSubcategoryButton(builder);
        Subcategory.successTransition();

    }
    @Test
    public static void filterTest() {

        Actions builder = new Actions(driver);

        SiteMenu.clickSubcategoryButton(builder);

        Filter.clickNameButton();
        Filter.nameSortCheck();

        Filter.clickPriceButton();
        Filter.priceSortCheck();
    }
    @Test
    public static void yellowDuckStickerTest() throws Exception {
        Actions builder = new Actions(driver);
        SiteMenu.clickSubcategoryButton(builder);
        YellowDuck.stickerCheck();

    }
    @Test
    public static void greenDuckStickerTest() throws Exception {
        SiteMenu.clickHomePageButton();
        GreenDuck.stickerCheck();
    }
    @Test
    public static void blueDuckStickerTest() throws Exception {
        SiteMenu.clickHomePageButton();
        BlueDuck.stickerCheck();
    }
}


