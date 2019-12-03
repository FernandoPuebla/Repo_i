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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TemplateSteps
{

    public void LaunchChrome_Method1()
    {
        String path="C:\\Users\\FernandoPueb_5dvr3\\IdeaProjects\\cucumber_report\\src\\main\\resources\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);//"webdriver.chrome.driver","C:/ChromeDriver/chromedriver.exe"
        ChromeOptions options=new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }


    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() {
        LaunchChrome_Method1();

    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^the page title should start with \"([^\"]*)\"$")
    public void thePageTitleShouldStartWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
