package pageobject.staticpo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Filter {
    private static By nameLocator = By.xpath("//a[text()='Name']");
    private static By priceLocator = By.xpath("//a[text()='Price']");
    private static By popularityLocator = By.xpath("//a[text()='Popularity']");
    private static By dateLocator = By.xpath("//a[text()='Date']");

    private static By nameSortedLocator = By.cssSelector(".name");
    private static By priceSortedLocator = By.cssSelector(".price, .campaign-price");


    public static void clickNameButton(WebDriver driver) {
        driver.findElement(nameLocator).click();
    }
    public static void clickPriceButton(WebDriver driver) {
        driver.findElement(priceLocator).click();
    }
    public static void clickPopularityButton(WebDriver driver) {
        driver.findElement(popularityLocator).click();
    }
    public static void clickDateButton(WebDriver driver) {
        driver.findElement(dateLocator).click();
    }
    public static void nameSortCheck(WebDriver driver) {
        ArrayList<WebElement> webList = new ArrayList(driver.findElements(nameSortedLocator));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);
    }
    public static void priceSortCheck(WebDriver driver) {
        ArrayList<WebElement> webList = new ArrayList(driver.findElements(priceSortedLocator));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);
    }
}
