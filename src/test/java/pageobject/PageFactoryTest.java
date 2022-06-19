package pageobject;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.pagefactory.Filter;
import pageobject.pagefactory.SiteMenu;

public class PageFactoryTest extends TestBase {

    @Test
    public void siteMenuTest() {
        Actions builder = new Actions(driver);
        SoftAssert softAssert = new SoftAssert();

        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);

        siteMenu.clickHomePageButton();
        softAssert.assertEquals(driver.getTitle(), "Online Store | My Store1");

        siteMenu.clickRubberDuckButton();
        softAssert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store1");

        siteMenu.clickDeliveryInformationButton();
        softAssert.assertEquals(driver.getTitle(), "Delivery Information | My Store1");

        siteMenu.clickTermsAndConditionsButton();
        softAssert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store1");

        siteMenu.clickSaleButton();
        softAssert.assertEquals(driver.getTitle(), "4 | My Store1");

        siteMenu.clickSubcategoryButton(builder);
        softAssert.assertEquals(driver.getTitle(), "Subcategory | My Store1");

        softAssert.assertAll();
    }

    @Test
    public void filterTest() {
        Actions builder = new Actions(driver);
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);

        Filter filter = PageFactory.initElements(driver, Filter.class);

        siteMenu.clickSubcategoryButton(builder);

        filter.clickNameButton();
        filter.nameSortCheck();

        filter.clickPriceButton();
        filter.priceSortCheck();
    }
}
