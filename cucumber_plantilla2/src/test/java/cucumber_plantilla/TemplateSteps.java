package cucumber_plantilla;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TemplateSteps {
    @Given("^A precondition$")
    public void aPrecondition() {
    }

    @When("^Something occurs$")
    public void somethingOccurs() {
    }

    @And("^A condition$")
    public void aCondition() {
    }

    @Then("^Do something$")
    public void doSomething() {
    }
}
