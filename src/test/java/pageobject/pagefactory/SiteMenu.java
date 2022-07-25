package pageobject.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SiteMenu {
    @FindBy(css = ".general-0")
    private WebElement homePageLocator;
    @FindBy(css = "#site-menu>ul>.category-1>a")
    private WebElement rubberDuckLocator;
    @FindBy(css = ".page-2>a")
    private WebElement deliveryInformationLocator;
    @FindBy(css = ".page-4>a")
    private WebElement termsAndConditionsLocator;
    @FindBy(css = ".page-5")
    private WebElement saleLocator;
    @FindBy(css = "#site-menu>ul>.category-1>ul>.category-2>a")
    private WebElement subcategoryLocator;

    private Actions builder;

    public void clickHomePageButton() {
        homePageLocator.click();
    }

    public void clickRubberDuckButton() {
        rubberDuckLocator.click();
    }

    public void clickDeliveryInformationButton() {
        deliveryInformationLocator.click();
    }

    public void clickTermsAndConditionsButton() {
        termsAndConditionsLocator.click();
    }

    public void clickSaleButton() {
        saleLocator.click();
    }
    public void clickSubcategoryButton(Actions builder) {
       WebElement rubberDuck = rubberDuckLocator;
       builder.moveToElement(rubberDuck).perform();
       subcategoryLocator.click();
    }
}