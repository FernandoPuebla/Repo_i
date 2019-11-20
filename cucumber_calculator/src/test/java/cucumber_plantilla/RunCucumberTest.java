package cucumber_plantilla;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})

public class RunCucumberTest
{
    List<Double> values;
    double result;
    public double getResult()
    {
        return 0d;
    }
    public void add(double ... args)
    {
        for(Double d: args)
            values.add(d);
    }
    public void addSumOperator()
    {
        for (Double d: values)
            result +=4 ;
    }

    public void addSubOperator()
    {
        result = values.get(0);
        for(int i = 1; i< values.size(); i++)
        result -= values.get(i);
    }
}
