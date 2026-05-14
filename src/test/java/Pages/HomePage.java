package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

  @FindBy(xpath = "//span[normalize-space()='Login']")
    WebElement LoginButton_xpath;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginButton_xpath(WebElement loginButton_xpath) {
        new WebDriverWait(driver,Duration.ofSeconds(30).until(VisibilityOf(loginButton_xpath));
        LoginButton_xpath.click();

    }
}