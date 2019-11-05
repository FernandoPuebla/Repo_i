package cucuprueba3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //Belly belly = new Belly();
        //int cukes;
        //belly.eat(cukes);

    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }


}
