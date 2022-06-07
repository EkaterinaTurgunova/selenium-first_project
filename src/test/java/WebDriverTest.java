import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class WebDriverTest {

    // Homework on topic #11 Selenium. Introduction
    @Test
    public void webDriverTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (WebElement link : allLinks) {
            System.out.println(link.getText());
        }
        WebElement myLink = driver.findElement(By.linkText("Drag and Drop"));
        myLink.click();

        WebElement checkMyLink = driver.findElement(By.cssSelector("div.example>h3"));

        System.out.println("\nLink check result: " + checkMyLink.getText());

        driver.close();

    }
    // Homework on topic #12 WebDriver Advanced p1
    @Test
    public void acmeStoreRubberDucksTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By.cssSelector("#site-menu>ul>.category-1>a"));
        rubberDucks.click();

        String rubberDucksText = driver.getTitle();
        Assert.assertEquals(rubberDucksText, "Rubber Ducks | My Store1");

        System.out.println("\nLink check result: " + driver.getTitle());

        driver.close();
    }

    @Test
    public void acmeStoreDeliveryInformationTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement deliveryInformation = driver.findElement(By.cssSelector(".page-2>a"));
        deliveryInformation.click();

        String deliveryInformationText = driver.getTitle();
        Assert.assertEquals(deliveryInformationText, "Delivery Information | My Store1");

        System.out.println("\nLink check result: " + driver.getTitle());

        driver.close();
    }

    @Test
    public void acmeStoreTermsConditionsTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement termsConditions = driver.findElement(By.cssSelector(".page-4>a"));
        termsConditions.click();

        String termsConditionsText = driver.getTitle();
        Assert.assertEquals(termsConditionsText, "Terms & Conditions | My Store1");

        System.out.println("\nLink check result: " + driver.getTitle());

        driver.close();
    }

    @Test
    public void doubleClickTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.pbclibrary.org/mousing/click3.htm");

        WebElement icon1 = driver.findElement(By.name("icon1"));
        WebElement icon2 = driver.findElement(By.name("icon2"));
        WebElement icon3 = driver.findElement(By.name("icon3"));

        Actions builder = new Actions(driver);

        builder.doubleClick(icon1).perform();
        builder.doubleClick(icon2).perform();
        builder.doubleClick(icon3).perform();

        driver.close();
    }

    @Test
    public void actionTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.pbclibrary.org/mousing/click4.htm");

        WebElement square = driver.findElement(By.name("drag1divNImG"));

        Actions builder = new Actions(driver);
        builder.clickAndHold(square).moveByOffset(400, 300).release().perform();

        driver.close();
    }

    @Test
    public void alertTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsAlert()']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "I am a JS Alert");
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You successfully clicked an alert");

        driver.close();
    }
    @Test
    public void acceptConfirmTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        confirmButton.click();

        Alert confirm = driver.switchTo().alert();
        String alertText = confirm.getText();
        Assert.assertEquals(alertText, "I am a JS Confirm");
        confirm.accept();

        WebElement result = driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You clicked: Ok");

        driver.close();
    }
    @Test
    public void dismissConfirmTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        confirmButton.click();

        Alert confirm = driver.switchTo().alert();
        String alertText = confirm.getText();
        Assert.assertEquals(alertText, "I am a JS Confirm");
        confirm.dismiss();

        WebElement result = driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You clicked: Cancel");

        driver.close();
    }
    @Test
    public void promptTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement promptButton = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
        promptButton.click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Hi!");
        String alertText = prompt.getText();
        Assert.assertEquals(alertText, "I am a JS prompt");
        prompt.accept();

        WebElement result = driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You entered: Hi!");

        driver.close();
    }

    // Homework on topic #13 WebDriver Advanced p2
    @Test
    public void acmeStoreNameSortingTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By
                .cssSelector("#site-menu>ul>.category-1>a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(rubberDucks).perform();
        WebElement subcategory = driver.findElement(By
                .cssSelector("#site-menu>ul>.category-1>ul>.category-2>a"));
        subcategory.click();

        WebElement nameButton = driver.findElement(By.xpath("//a[text()='Name']"));
        nameButton.click();

        ArrayList<WebElement> webList = new ArrayList<>(driver.findElements(By.cssSelector(".name")));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();

        Collections.sort(cloneList);
        Assert.assertEquals(textList, cloneList);

        driver.close();
    }

    @Test
    public void acmeStorePriceSortingTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By.cssSelector("#site-menu>ul>.category-1>a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(rubberDucks).perform();
        WebElement subcategory = driver.findElement(By
                .cssSelector("#site-menu>ul>.category-1>ul>.category-2>a"));
        subcategory.click();

        WebElement nameButton = driver.findElement(By.xpath("//a[text()='Name']"));
        nameButton.click();

        WebElement priceButton = driver.findElement(By.xpath("//a[text()='Price']"));
        priceButton.click();

        ArrayList<WebElement> webList = new ArrayList<>(driver.findElements(By
                .cssSelector(".price, .campaign-price")));
        for (WebElement webDucks : webList) {
            System.out.println(webDucks.getText());
        }
        ArrayList<String> textList = (ArrayList<String>) webList.stream().map(WebElement::getText)
                .collect(Collectors.toList());

        ArrayList<String> cloneList = (ArrayList<String>)textList.clone();
        Collections.sort(cloneList);

        Assert.assertEquals(textList, cloneList);

        driver.close();
    }

    @Test
    public void acmeStoreStickerSaleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By.cssSelector("#site-menu>ul>.category-1>a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(rubberDucks).perform();

        WebElement yellowDuck = driver.findElement(By.cssSelector(".link[title='Yellow Duck']"));
        WebElement sticker = yellowDuck.findElement(By.cssSelector(".sticker.sale"));
        String stickerText = sticker.getText();

        Assert.assertEquals(stickerText, "SALE");

        driver.close();
    }

    @Test
    public void acmeStoreStickerNewTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement homePage = driver.findElement(By.cssSelector(".fa.fa-home"));
        homePage.click();

        WebElement greenDuck = driver.findElement(By.cssSelector(".link[title='Green DucK']"));
        WebElement sticker = greenDuck.findElement(By.cssSelector(".sticker.new"));
        String stickerText = sticker.getText();

        Assert.assertEquals(stickerText, "NEW");

        driver.close();
    }
}