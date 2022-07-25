package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import static pageobject.helpers.Locators.getLocator;

public class Filter {

    private WebDriver driver;

    public Filter (WebDriver driver) {
        this.driver = driver;
    }
    public void clickNameButton() throws Exception {
        driver.findElement(getLocator("Filter.nameLocator")).click();
    }
    public void clickPriceButton() throws Exception {
        driver.findElement(getLocator("Filter.priceLocator")).click();
    }
    public void clickPopularityButton() throws Exception {
        driver.findElement(getLocator("Filter.popularityLocator")).click();
    }
    public void clickDateButton() throws Exception {
        driver.findElement(getLocator("Filter.dateLocator")).click();
    }
    public void nameSortCheck() throws Exception {
        ArrayList<WebElement> webList = new ArrayList(driver.findElements(getLocator("Filter.nameSortedLocator")));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);
    }
    public void priceSortCheck() throws Exception {
        ArrayList<WebElement> webList = new ArrayList(driver.findElements(getLocator("Filter.priceSortedLocator")));
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
