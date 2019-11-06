package cucumber_table;

import Base.BaseUtil;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest()
    {
        System.out.println("Opening the browser: MOCK");
        /*//Passing a dummy WebDriver instance
        base.StepInfo = "ChromeDriver"; //FirefoxDriver
         */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\FernandoPueb_5dvr3\\Downloads\\chromedriver_win32");///path/to/chromedriver
        WebDriver driver = new ChromeDriver();
    }
    @After
    public void TearDownTest(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            //Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }
}
