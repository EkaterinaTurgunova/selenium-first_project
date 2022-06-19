package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SiteMenu {
    private By homePageLocator = By.cssSelector(".general-0");
    private By rubberDuckLocator = By.cssSelector("#site-menu>ul>.category-1>a");
    private By deliveryInformationLocator = By.cssSelector(".page-2>a");
    private By termsAndConditionsLocator = By.cssSelector(".page-4>a");
    private By saleLocator = By.cssSelector(".page-5");
    private By subcategoryLocator = By.cssSelector("#site-menu>ul>.category-1>ul>.category-2>a");

    private WebDriver driver;
    private Actions builder;


    public SiteMenu (WebDriver driver,Actions builder) {
        this.driver = driver;
        this.builder = builder;
    }

    public void clickHomePageButton() {
        driver.findElement(homePageLocator).click();
    }

    public void clickRubberDuckButton() {
        driver.findElement(rubberDuckLocator).click();
    }

    public void clickDeliveryInformationButton() {
        driver.findElement(deliveryInformationLocator).click();
    }

    public void clickTermsAndConditionsButton() {
        driver.findElement(termsAndConditionsLocator).click();
    }

    public void clickSaleButton() {
        driver.findElement(saleLocator).click();
    }
    public void clickSubcategoryButton() {
       WebElement rubberDuck = driver.findElement(rubberDuckLocator);
       builder.moveToElement(rubberDuck).perform();
       driver.findElement(subcategoryLocator).click();
    }
}