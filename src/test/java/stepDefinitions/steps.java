package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {

    WebDriver driver;

    @Given("that i have valid credentials")
    public void that_i_have_valid_credentials() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[3]/button")).click();
    }

    @Given("i input the valid email")
    public void i_input_the_valid_email() {
        driver.findElement(By.id("login-email")).sendKeys("admin@gmail.com");
    }

    @Given("also input a valid password")
    public void also_input_a_valid_password() {
        driver.findElement(By.id("login-password")).sendKeys("@12345678");;
    }

    @When("click the login button")
    public void click_the_login_button() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Then("I should login successfully to the page")
    public void i_should_login_successfully_to_the_page() {
        // Add verification here
        System.out.println("Login test completed!");
        driver.quit();
    }
}
