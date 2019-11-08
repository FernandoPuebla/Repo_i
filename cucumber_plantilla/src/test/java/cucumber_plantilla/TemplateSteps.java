package cucumber_plantilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TemplateSteps {

    WebDriver driver = null;

    @Given("^I have open the browser$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/FernandoPueb_5dvr3/Downloads/chromedriver_win32.exe");
        driver = new ChromeDriver();
    }

    @When("^I open Facebook website$")
    public void goToFacebook() {
        driver.navigate().to("https://www.facebook.com/");
    }

    @Then("^Login button should exits$")
    public void loginButton() {
        if(driver.findElement(By.id("u_0_v")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
    }

    @Then("^Forgot password link should exist$")
    public void forgotPWD() {
        if(driver.findElement(By.id("")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
    }

    @Given("^I have opened the browser$")
    public void iHaveOpenedTheBrowser() {
    }

    @Then("^Login button should exist$")
    public void loginButtonShouldExist() {
    }
}

