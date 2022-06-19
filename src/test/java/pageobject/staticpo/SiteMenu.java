package pageobject.staticpo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SiteMenu {
    private static By homePageLocator = By.cssSelector(".general-0");
    private static By rubberDuckLocator = By.cssSelector("#site-menu>ul>.category-1>a");
    private static By deliveryInformationLocator = By.cssSelector(".page-2>a");
    private static By termsAndConditionsLocator = By.cssSelector(".page-4>a");
    private static By saleLocator = By.cssSelector(".page-5");
    private static By subcategoryLocator = By.cssSelector("#site-menu>ul>.category-1>ul>.category-2>a");

//    private WebDriver driver;
//    private Actions builder;
//
//
//    public SiteMenu (WebDriver driver, Actions builder) {
//        this.driver = driver;
//        this.builder = builder;
//    }

    public static void clickHomePageButton(WebDriver driver) {
        driver.findElement(homePageLocator).click();
    }

    public static void clickRubberDuckButton(WebDriver driver) {
        driver.findElement(rubberDuckLocator).click();
    }

    public static void clickDeliveryInformationButton(WebDriver driver) {
        driver.findElement(deliveryInformationLocator).click();
    }

    public static void clickTermsAndConditionsButton(WebDriver driver) {
        driver.findElement(termsAndConditionsLocator).click();
    }

    public static void clickSaleButton(WebDriver driver) {
        driver.findElement(saleLocator).click();
    }
    public static void clickSubcategoryButton(WebDriver driver, Actions builder) {
       WebElement rubberDuck = driver.findElement(rubberDuckLocator);
       builder.moveToElement(rubberDuck).perform();
       driver.findElement(subcategoryLocator).click();
    }
}