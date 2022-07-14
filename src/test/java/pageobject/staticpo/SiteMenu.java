package pageobject.staticpo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pageobject.helpers.WebDriverContainer.getDriver;

public class SiteMenu {
    private static By homePageLocator = By.cssSelector(".general-0");
    private static By rubberDuckLocator = By.cssSelector("#site-menu>ul>.category-1>a");
    private static By deliveryInformationLocator = By.cssSelector(".page-2>a");
    private static By termsAndConditionsLocator = By.cssSelector(".page-4>a");
    private static By saleLocator = By.cssSelector(".page-5");
    private static By subcategoryLocator = By.cssSelector("#site-menu>ul>.category-1>ul>.category-2>a");


    public static void clickHomePageButton() {
        getDriver().findElement(homePageLocator).click();
    }

    public static void clickRubberDuckButton() {
        getDriver().findElement(rubberDuckLocator).click();
    }

    public static void clickDeliveryInformationButton() {
        getDriver().findElement(deliveryInformationLocator).click();
    }

    public static void clickTermsAndConditionsButton() {
        getDriver().findElement(termsAndConditionsLocator).click();
    }

    public static void clickSaleButton() {
        getDriver().findElement(saleLocator).click();
    }
    public static void clickSubcategoryButton(Actions builder) {
       WebElement rubberDuck = getDriver().findElement(rubberDuckLocator);
       builder.moveToElement(rubberDuck).perform();
        getDriver().findElement(subcategoryLocator).click();
    }
}