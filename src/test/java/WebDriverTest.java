import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.List;


public class WebDriverTest {


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

    @Test
    public void webDriverTestAcmeStoreRubberDucks() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By.cssSelector("#site-menu>ul>li.category-1>a"));
        rubberDucks.click();

        String rubberDucksText = driver.getTitle();
        Assert.assertEquals(rubberDucksText, "Rubber Ducks | My Store1");

        System.out.println("\nLink check result: " + driver.getTitle());

        driver.close();
    }

    @Test
    public void webDriverTestAcmeStoreDeliveryInformation() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement deliveryInformation = driver.findElement(By.cssSelector("li.page-2>a"));
        deliveryInformation.click();

        String deliveryInformationText = driver.getTitle();
        Assert.assertEquals(deliveryInformationText, "Delivery Information | My Store1");

        System.out.println("\nLink check result: " + driver.getTitle());

        driver.close();
    }

    @Test
    public void webDriverTestAcmeStoreTermsConditions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement termsConditions = driver.findElement(By.cssSelector("li.page-4>a"));
        termsConditions.click();

        String termsConditionsText = driver.getTitle();
        Assert.assertEquals(termsConditionsText, "Terms & Conditions | My Store1");

        System.out.println("\nLink check result: " + driver.getTitle());

        driver.close();

    }
}