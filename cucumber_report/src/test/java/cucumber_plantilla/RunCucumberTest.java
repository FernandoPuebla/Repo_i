package cucumber_plantilla;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",  "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json" })

public class RunCucumberTest
{
}
