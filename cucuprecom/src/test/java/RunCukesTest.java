import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = {"com.exama"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class RunCukesTest {
}
