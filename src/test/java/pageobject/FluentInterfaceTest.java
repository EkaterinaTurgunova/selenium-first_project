package pageobject;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageobject.fluentinterface.*;

public class FluentInterfaceTest extends TestBase {

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
        SiteMenu siteMenu = new SiteMenu(driver, builder);

        Filter filter = new Filter(driver);

        siteMenu.clickSubcategoryButton();

        filter
                .clickNameButton()
                .nameSortCheck();

        filter
                .clickPriceButton()
                .priceSortCheck();
    }
}
