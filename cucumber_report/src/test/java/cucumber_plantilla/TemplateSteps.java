package cucumber_plantilla;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TemplateSteps
{
    @Test
    public void LaunchChrome_Method1()
    {
        System.setProperty("webdriver.chrome.driver","C:/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }


    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() {
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the page title should start with \"([^\"]*)\"$")
    public void thePageTitleShouldStartWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
