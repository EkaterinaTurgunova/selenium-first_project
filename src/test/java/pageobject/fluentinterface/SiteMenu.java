package pageobject.fluentinterface;

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

    public HomePage clickHomePageButton() {
        driver.findElement(homePageLocator).click();
        return new HomePage(driver);
    }

    public RubberDuck clickRubberDuckButton() {
        driver.findElement(rubberDuckLocator).click();
        return new RubberDuck(driver);
    }

    public DeliveryInformation clickDeliveryInformationButton() {
        driver.findElement(deliveryInformationLocator).click();
        return new DeliveryInformation(driver);
    }

    public TermsAndConditions clickTermsAndConditionsButton() {
        driver.findElement(termsAndConditionsLocator).click();
        return new TermsAndConditions(driver);
    }

    public Sale clickSaleButton() {
        driver.findElement(saleLocator).click();
        return new Sale(driver);
    }
    public Subcategory clickSubcategoryButton() {
       WebElement rubberDuck = driver.findElement(rubberDuckLocator);
       builder.moveToElement(rubberDuck).perform();
       driver.findElement(subcategoryLocator).click();

       return new Subcategory(driver);
    }
}