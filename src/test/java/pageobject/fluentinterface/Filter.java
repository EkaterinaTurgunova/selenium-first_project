package pageobject.fluentinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Filter {
    private By nameLocator = By.xpath("//a[text()='Name']");
    private By priceLocator = By.xpath("//a[text()='Price']");
    private By popularityLocator = By.xpath("//a[text()='Popularity']");
    private By dateLocator = By.xpath("//a[text()='Date']");

    private By nameSortedLocator = By.cssSelector(".name");
    private By priceSortedLocator = By.cssSelector(".price, .campaign-price");

    private WebDriver driver;

    public Filter (WebDriver driver) {
        this.driver = driver;
    }
    public Filter clickNameButton() {
        driver.findElement(nameLocator).click();
        return this;
    }
    public Filter clickPriceButton() {
        driver.findElement(priceLocator).click();
        return this;
    }
    public Filter clickPopularityButton() {
        driver.findElement(popularityLocator).click();
        return this;
    }
    public Filter clickDateButton() {
        driver.findElement(dateLocator).click();
        return this;
    }
    public Filter nameSortCheck() {
        ArrayList<WebElement> webList = new ArrayList(driver.findElements(nameSortedLocator));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);

        return this;
    }
    public Filter priceSortCheck() {
        ArrayList<WebElement> webList = new ArrayList(driver.findElements(priceSortedLocator));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);

        return this;
    }
}
