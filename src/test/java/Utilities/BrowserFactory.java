package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {

        ChromeOptions chromeOptions = new ChromeOptions();

        if (browserChoice.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver(chromeOptions);
            chromeOptions.addArguments("--headless");

        } else if (browserChoice.equalsIgnoreCase("Edge")) {
            EdgeOptions EdgeOptions = new EdgeOptions();
            driver = new EdgeDriver(EdgeOptions);

        } else {
            driver = new SafariDriver();

        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}