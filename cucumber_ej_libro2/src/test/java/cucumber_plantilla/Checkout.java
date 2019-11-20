package cucumber_plantilla;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})

public class Checkout
{
    private int runningTotal = 0;
    public void add(int count, int price)
    {
        runningTotal += (count * price);
    }
    public int total()
    {
        return runningTotal;
    }
}
