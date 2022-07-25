package pageobject.helpers;

import org.openqa.selenium.By;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Locators {
    private static Properties locators;

    static {
        locators = new Properties();
        InputStream is = Locators.class.getResourceAsStream("/locators.properties");

        try {
            locators.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Could not read from locators.properties file\n" + e.getMessage());
        }
    }

    public static By getLocator (String element) throws Exception {
        String locator = locators.getProperty(element);

        String[] substrings = locator.split("=", 2);
        LocatorsTypes locatorType = LocatorsTypes.valueOf(substrings[0]);

        String selector = substrings[1];

        switch (locatorType) {
            case id:
                return By.id(selector);
            case css:
                return By.cssSelector(selector);
            case xpath:
                return By.xpath(selector);

            default: throw new Exception("No such locator type");
        }
    }
}
