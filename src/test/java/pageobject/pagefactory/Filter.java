package pageobject.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    @FindBy(xpath = "//a[text()='Name']")
    private WebElement nameLocator;
    @FindBy(xpath = "//a[text()='Price']")
    private WebElement priceLocator;
    @FindBy(xpath = "//a[text()='Popularity']")
    private WebElement popularityLocator;
    @FindBy(xpath = "//a[text()='Date']")
    private WebElement dateLocator;

    @FindAll({
            @FindBy (css = ".name")
    })
    private List<WebElement> nameSortedLocator;
    @FindAll({
    @FindBy(css = ".price, .campaign-price")
    })
    private List<WebElement> priceSortedLocator;

    private WebDriver driver;


    public void clickNameButton() {
        nameLocator.click();
    }
    public void clickPriceButton() {
        priceLocator.click();
    }
    public void clickPopularityButton() {
        popularityLocator.click();
    }
    public void clickDateButton() {
        dateLocator.click();
    }
    public void nameSortCheck() {
        ArrayList<WebElement> webList = new ArrayList(nameSortedLocator);
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);
    }
    public void priceSortCheck() {
        ArrayList<WebElement> webList = new ArrayList(priceSortedLocator);
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
