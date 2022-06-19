package pageobject;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.staticpo.Filter;
import pageobject.staticpo.SiteMenu;


public class StaticPOTest extends TestBase {

    static SoftAssert softAssert = new SoftAssert();
    @Test
    public static void siteMenuTest() {

        Actions builder = new Actions(driver);

        SiteMenu.clickHomePageButton(driver);
        softAssert.assertEquals(driver.getTitle(),"Online Store | My Store1");

        SiteMenu.clickRubberDuckButton(driver);
        softAssert.assertEquals(driver.getTitle(),"Rubber Ducks | My Store1");

        SiteMenu.clickDeliveryInformationButton(driver);
        softAssert.assertEquals(driver.getTitle(),"Delivery Information | My Store1");

        SiteMenu.clickTermsAndConditionsButton(driver);
        softAssert.assertEquals(driver.getTitle(),"Terms & Conditions | My Store1");

        SiteMenu.clickSaleButton(driver);
        softAssert.assertEquals(driver.getTitle(),"4 | My Store1");

        SiteMenu.clickSubcategoryButton(driver, builder);
        softAssert.assertEquals(driver.getTitle(), "Subcategory | My Store1");

        softAssert.assertAll();
    }
    @Test
    public void filterTest() {

        Actions builder = new Actions(driver);

        SiteMenu.clickSubcategoryButton(driver, builder);

        Filter.clickNameButton(driver);
        Filter.nameSortCheck(driver);

        Filter.clickPriceButton(driver);
        Filter.priceSortCheck(driver);
    }
}


