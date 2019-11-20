package cucumber_plantilla;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TemplateSteps {

    @Given("^a calculator I just turned on$")
    public void aCalculatorIJustTurnedOn() {
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg0, int arg1) {
    }

    @And("^I press \\+$")
    public void iPress() {
        calc.addSubOperator();
    }

    @Then("^the result is (\\d+)$")
    public void theResultIs(int arg0) {
    }

    @And("^I press -$")
    public void iPress() {
    }
}
